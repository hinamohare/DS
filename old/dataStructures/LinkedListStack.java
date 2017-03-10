package dataStructures;
import dataStructures.Node;
public class LinkedListStack <E>{
Node<E> stackTop;
int count;
	LinkedListStack()
	{
		stackTop = null;
		count =0;
	}
	public void push(E data)
	{
		Node<E> newNode = new Node<E>(data, null);
		if(stackTop==null)
		{
			stackTop = newNode;
		}
		else
		{
			newNode.setNext(stackTop);
			stackTop = newNode;
		}
		count++;
	}
	public void pop()
	{	if(stackTop == null)
			return;
		stackTop = stackTop.getNext();	
	}
	public E top()
	{	if(stackTop != null)
		 	{
				return stackTop.getValue();
		 	}
		else
			return null;
	}
	public boolean isEmpty()
	{
		return (stackTop == null);
	}
	public void clear()
	{
		stackTop = null;
		
	}
	public void printStack()
	{
		Node<E> current = stackTop;
		while(current!=null)
		{
			System.out.print(current.getValue()+" ");
			current = current.getNext();
		}
	}
	public String reverseString(String inputString)
	{	int i=0; 
	char[] inputArray = inputString.toCharArray();
		char[] reversedString = null;
		LinkedListStack S = new LinkedListStack();
		while(inputArray[i]!='\n')
		{
			S.push(inputArray[i]);
		}
		
		while(stackTop!=null)
		{
			reversedString[i] = (char) S.top();
			S.pop();
			
		}
		return reversedString.toString();
	}
}
