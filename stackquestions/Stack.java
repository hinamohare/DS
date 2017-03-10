package stackquestions;
import linkedList.Node;
public class Stack {
	Node top;
	int size;
	public Stack(){
		top = null;
		size =0;
	}
	public void push(Object inputdata){
		Node newnode = new Node(inputdata);
		newnode.next = top;
		top= newnode;
		size++;
	}
	public Object pop(){
		if(top == null)
			return null;
		else
		{
			Object data = top.data;
			top = top.next;
			size--;
			return data;
			
		}
	}
	public Object peek()
	{
		if(!isempty())
			return top.data;
		else
			return null;
	
	}
	public boolean isempty()
	{
		return top == null;
	}
	public Node getStackTop()
	{
		return top;
	}
	public void printStackElements()
	{
		Node current = getStackTop();
		while(current!= null)
		{
			System.out.println(current.data);
			current = current.next;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack();
		System.out.println("initial stack");
		//System.out.println(s.peek());
		for(int i = 1; i<=5; i++)
		{
			s.push(i);
		}
		System.out.println("stack elements are: ");
		/*
		while(!s.isempty())
		{
			System.out.println(s.pop());
		}
		*/
		s.printStackElements();
		
	}

}
