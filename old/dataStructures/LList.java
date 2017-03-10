package dataStructures;
import dataStructures.LinkedList;
public class LList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> L = new LinkedList<Integer> ();
		L.add(1);
		L.add(2);
		L.add(3);
		L.add(4);
		L.add(5);
		//L.insertAt(0, 1);
		//L.clear();
		//L.remove();
		//L.removeAt(5);
		//L.removeAt(1);
		//L.getHeadTail();
		L.printList();
		System.out.println();
		L.reverse();
		L.printList();
		System.out.println();
		
		L.reverseAt(5);
		L.printList();
		
		
		
		
	}

}
