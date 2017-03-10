package stackquestions;
import java.util.Scanner;

public class TowerOfHanoi{
	Stack s ;
	TowerOfHanoi()
	{
		s = new Stack();
	}
	
	public void add(Object data){
		
		Object lastitem = s.peek();
			if(lastitem == null)
			{
			 lastitem = Integer.MAX_VALUE;
			}
			
			if((Integer)data >= (Integer)lastitem  && !s.isempty())
			{ 
				System.out.println("Larger data than the top of tower can't be inserted into the tower");
			}
			else
				s.push(data);
	}
	public void movedisc(int n, TowerOfHanoi destination, TowerOfHanoi buffer )
	{
		if(n>0)
		{
			movedisc(n-1,  buffer, destination);
			moveTop(destination);
			movedisc(n-1,  destination, this);
		}
	}
	public void moveTop( TowerOfHanoi destination)
	{
		Object top = s.pop();
		destination.add(top);
	}
	public void printTowerElement()
	{
		s.printStackElements();
	}
	
	public static void main(String[] args) {
		TowerOfHanoi[] t = new TowerOfHanoi[3];
		for(int index =0; index<3; index++)
			t[index] = new TowerOfHanoi();
		
		for (int i=4; i>= 1;i--)
		{	
			t[0].add(i);
		}
		
		System.out.println("Elements added successfully to tower 0");
		t[0].printTowerElement();
		System.out.println("completed printing tower 0 data");
		t[0].movedisc(5, t[2], t[1]);
		System.out.println("Elements moved successfully to tower 2");
	    t[2].printTowerElement();
	    System.out.println("completed printing tower 2 data");
		
	}
	

}
