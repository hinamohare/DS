package CTCI;
import java.util.Scanner;

import dataStructures.LinkedList;
import dataStructures.Node;
public class List3 {
	
	private static Scanner reader;

	public static void main(String[] args) {
		LinkedList L = new LinkedList();
		L.add(1);
		L.add(4);
		L.add(5);
		L.add(2);
		L.add(3);
		L.add(9);
		L.add(6);
		L.add(8);
		L.add(7);
		L.printList();
		Node current = L.gethead();
		reader = new Scanner (System.in);
		int node;
		System.out.println("Enter the node value: ");
		node = reader.nextInt();
		while((int)current.getValue()!= node)
		{
			current = current.getNext();
		}
		
		Node front = current;
		Node back = current, temp;
		current = L.gethead();
		while(current!=null)
		{
			if((int)current.getValue() < node)
			{	temp = current.getNext();
				current.setNext(front);
				front = current;
				current = temp;
			}
			else
			{
				temp = current.getNext();
				back.setNext(current);
				back = current;
				current = temp;
			}
		}
		back.setNext(null);
		L.sethead(front);
		L.printList();
		
	}

}
