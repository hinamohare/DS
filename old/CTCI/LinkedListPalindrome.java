package CTCI;


import java.util.Stack;

import dataStructures.*;

public class LinkedListPalindrome {

	public static void main(String[] args) {
	
	LinkedList L = new LinkedList();
	L.add(1);
	L.add(2);
	//L.add(3);
	L.add(4);
	//L.add(3);
	L.add(2);
	L.add(1);
		Stack stack = new Stack();
		Node slow = L.gethead();
		Node fast = L.gethead();
		
		
		while(fast!=null && fast.getNext()!=null)
		{
			stack.push(slow.getValue());
			slow = slow.getNext();
			fast = fast.getNext().getNext();	
		}
		if(fast!=null)
		{
			slow = slow.getNext();
		}
		while(slow!=null)
		{	int top = ((int) stack.pop());
		
			if((int) slow.getValue()!= top)
			{	
				System.out.println("The list is not palindrome");
				break;
			}
			slow = slow.getNext();
		}
		
		if(slow == null)
			System.out.println("The list is palindrome");
		
			
	}

}
