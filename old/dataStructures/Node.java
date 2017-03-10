package dataStructures;

public class Node<E> {
	private E value;
	private Node<E> next;
	public Node(Node<E> nextNode)
	{
		next= nextNode;
	}
	public Node(E inputValue,Node<E> nextNode)
	{
		value = inputValue;
		next= nextNode;	
	}
	public void setValue(E inputValue)
	{
		value = inputValue;
	}
	public void setNext(Node<E> nextNode)
	{
		next= nextNode;	
	}
	public E getValue()
	{
		return value;
	}
	public Node<E> getNext()
	{
		return next;
	}
}
