package dataStructures;
import dataStructures.Node;
public class LinkedList<E> {
Node<E> head; //head node
Node<E> tail; //tail node
int count; //count of the total number of nodes in the list

//constructor 
public LinkedList()
{
	head = tail = new Node<E>(null);
	count = 0;
}

public Node gethead()
{
	return head.getNext();
}
public void sethead(Node newHead)
{
	head.setNext( newHead);
}
//clears all the nodes from the list
public void clear() { // Remove all elements
	head = tail = null;
	head = tail = new Node<E> (null);
	count= 0;
}

//insert data at particular position in the list
public void insertAt(E data, int position)
{	Node<E> newNode = new Node<E>(data, null);
	
	if(count==0)
	{
		head.setNext(newNode);
		tail.setNext(newNode);
	}
	if(position==1)
	{
		newNode.setNext(head.getNext());
		head.setNext(newNode);
	}
	else
	{
		int counter =2;
		Node<E> current = head.getNext().getNext(), trailcurrent=head.getNext();
		while(position!=counter && current!=null)
		{
			trailcurrent=current;
			current = current.getNext();
			counter++;
		}
		trailcurrent.setNext(newNode);
		newNode.setNext(current);
		if(position == count+1)
			tail = newNode;
	}
	
	count++;
} 

//add node at the end of the list
public void  add(E data)
{
	Node<E> temp = new Node<E>(data,null);
	if(head.getNext()==null)
	{ head.setNext(temp);	
	  tail = temp;
	}
	else
	{	tail.setNext(temp);
		tail = temp;
		
	}
	count++;
}

//remove node at particular position from list
public void removeAt(int position)
{
	Node<E> current = head;
	Node<E> trailCurrent = null;
	int counter = 0;
	if(head.getNext()==null)
	{
		System.out.println("cant remove element from empty list");
	}
	else
	{	if(head.getNext() == tail)
		{
			head = tail = null;
			head = tail = new Node<E>(null);
		}
		else
		{
				while(current!=null)
				{	if(counter== position)
							break;
					trailCurrent = current;
					current = current.getNext();
					counter++;
				}
				if(current==null)
				{
					System.out.println("no element is present at this position in the list");
					
				}
				else{
				
					trailCurrent.setNext(current.getNext());
					if(current == tail)
					{
						tail = trailCurrent;
					}
						
				}
				
		}
		count--;
	}
} 

//remove node from the tail of the list
public void remove() {

	if(head.getNext()== null)
		System.out.println("the list is empty, can't remove from empty list");
	else
	{	if(head.getNext() == tail)
			{head = tail = null;
				head = tail = new Node(null);
			
			}
		else
		{	Node<E> current,trailcurrent = null;
			current = head.getNext();
			while(current.getNext()!=null)
			{	trailcurrent = current;
				current = current.getNext();
			}
			trailcurrent.setNext(null);	
			tail = trailcurrent;
		}
		count--;
	}
}

//print elements in list
public void printList()
{
	Node<E> temp;
	temp = head.getNext();
	while(temp!=null)
	{	
		System.out.print(temp.getValue()+" ");
		temp = temp.getNext();
		
	}
}
///size 
public int size()
{
	return count;
}

//reverse list
public void reverse()
{
	Node<E> current= null, lastAddedNode = null, temp = null;
	tail = head.getNext();
	current = head.getNext().getNext();
	lastAddedNode = tail;
	lastAddedNode.setNext(null);
	while(current!=null)
	{
		temp = current.getNext();
		current.setNext(lastAddedNode);
		lastAddedNode = current;
		current = temp;
	}
	head.setNext(lastAddedNode);
	
}

//print list in reverse order
public void printReverseList()
{
	Node<E> current = head.getNext();
	printReverse(current);
}

//recursive print list function
private void printReverse(Node<E> current) {
	if(current!= null)
	{
		printReverse(current.getNext());
		System.out.print(current.getValue()+" ");
	}
	
}

//copy one list to other
public void copy(LinkedList List)
{
	if(List.size()==0)
	{
		clear();
		return;
	}
	
	
	Node<E> current = List.head.getNext();
	Node<E> newNode = new Node<E>(current.getValue(),null);
	head.setNext(newNode);
	current=current.getNext();
	Node<E> lastAddedNode = newNode;
	while(current!=null)
	{	Node<E> node = new Node<E>(current.getValue(),null);
		lastAddedNode.setNext(node);
		lastAddedNode = node;
		current = current.getNext();
	}
	count = List.count;
	tail = lastAddedNode;
}

//find length and 
public E middleElement()
{	int length =0;
	Node<E> current= head.getNext();
	Node<E> middle=head.getNext();
	while(current!=null && current.getNext()!=null)
	{
		
		current = current.getNext().getNext();
		middle = middle.getNext();
		
	}
	System.out.println("\nThe middle element of the list is : "+middle.getValue());
	current = head.getNext();
	
	//length calculation
	while(current!=null)
	{
		current=current.getNext();
		length++;
	}
	return middle.getValue();
	
}

//swap two any nodes of list
public void swap(E x, E y)
{	// Nothing to do if x and y are same
    if (x == y) return;
    
    // Search for x (keep track of prevX and CurrX)
    Node<E> prevX = null, currX = head.getNext();
    while (currX != null && currX.getValue() != x)
    {
        prevX = currX;
        currX = currX.getNext();
    }

    // Search for y (keep track of prevY and currY)
    Node prevY = null, currY = head.getNext();
    while (currY != null && currY.getValue()!= y)
    {
        prevY = currY;
        currY = currY.getNext();
    }

    // If either x or y is not present, nothing to do
    if (currX == null || currY == null)
        return;
    System.out.println("before swapping tail is: "+tail.getValue());
  //adjust tail
    if(currX == tail)
    	tail =currY;
    if(currY == tail)
    	tail=currX;
    
    System.out.println("afterk swapping tail is: "+tail.getValue());
    // If x is not head of linked list
    if (prevX != null)
        prevX.setNext(currY); 
    else //make y the new head
        head.setNext(currY);

    // If y is not head of linked list
    if (prevY != null)
        prevY.setNext( currX);
    else // make x the new head
        head.setNext(currX);

    // Swap next pointers
    Node temp = currX.getNext();
    currX.setNext( currY.getNext());
    currY.setNext(temp);
	
}

//get head and tail node values of list
public void getHeadTail()
{
	System.out.println("\nThe head: "+head.getNext().getValue()+"  The tail: "+tail.getValue());
}


//reverse list at perticular position
public void reverseAt(int position)
{	//if position is first element
	if(position==1)
		return ;
	Node<E> current = head.getNext().getNext(), temp;
	Node<E> lastNode = head.getNext();
	Node<E> trailCurrent = head.getNext();
	int counter = 2;
	while(counter<=position && current!=null)
	{
		temp = current.getNext();
		current.setNext(trailCurrent);
		trailCurrent=current;
		current=temp;
		counter++;	
	}
	lastNode.setNext(current);
	head.setNext(trailCurrent);
	if(current==null)
	{	
		tail = lastNode;
		
	}
}


}
