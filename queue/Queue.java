package queue;
import linkedList.Node;
public class Queue {
	Node first;
	Node last;
	public Queue(){
		first = null;
		last = null;
	}
	public void enqueue(Object inputdata){
		Node newnode = new Node(inputdata);
		if(first == null)
		{ 
			first = newnode;
			last = first;
		}
		else
		{
			last.next = newnode;
			last = newnode;
		}
	}
	public Object dequeue()
	{
		if(first == null)
			return null;
		else
		{
			Object data = first.data;
			first = first.next;
			return data;
		}
	}
	public boolean isempty(){
		return first == null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q = new Queue();
		for(int i =1; i<=5; i++)
			{
				q.enqueue(i);
			}
		while(!q.isempty())
		{
			System.out.println(q.dequeue());
		}

	}

}
