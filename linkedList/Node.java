package linkedList;

public class Node {
	public Object data;
	public Node next = null;
	
	public Node(Object inputData, Node nextNode)
	{
		data = inputData;
		next = nextNode;
	}
	public Node(Object inputData){
		data = inputData;
	}
	
}
