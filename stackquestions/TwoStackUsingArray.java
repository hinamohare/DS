package stackquestions;

public class TwoStackUsingArray {
	int sizeOfArray = 8;
	int[] array = new int[sizeOfArray];
	int topOfStack1 = -1;
	int topOfStack2 = sizeOfArray;
	
	public void pushStack1(int data)
	{
		if(topOfStack2 - topOfStack1 > 1)
		{
			topOfStack1++;
			array[topOfStack1]= data;
		}
		else
		{
			System.out.println("OOPS!! The stack1 is full, can't push "+data+" into stack 1");
		}
	}
	public void pushStack2(int data)
	{
		if(topOfStack2 - topOfStack1 > 1)
		{
			topOfStack2--;
			array[topOfStack2]= data;
		}
		else
		{
			System.out.println("OOPS!! The stack2 is full, can't push "+data+" into stack 2");
		}
	}
	public int popStack1()
	{
		
			if(topOfStack1>=0)
			{
				int data = array[topOfStack1];
				topOfStack1--;
				return data;
			}
			else
		{
			System.out.println("The stack1 is empty, cant pop any more elements");
			
		}
			return 0;
		
	}
	public int popStack2()
	{
		if(topOfStack2 < sizeOfArray)
		{
			int data = array[topOfStack2];
			topOfStack2++;
			return data;
		}
		else
	{
		System.out.println("The stack1 is empty, cant pop any more elements");
		
	}
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoStackUsingArray s = new TwoStackUsingArray();
		for(int i =1; i<= 3; i++)
		{
			System.out.println("pushing "+i +"into stack 1");
			s.pushStack1(i);
		}
		for(int i =1; i<= 6; i++)
		{	System.out.println("pushing "+i +"into stack 2");
			s.pushStack2(i);
		}
		for(int i =1; i<= 5; i++)
		{
			System.out.println("poping from stack 1");
			System.out.println(s.popStack1());
		}
		for(int i =1; i<= 7; i++)
		{
			System.out.println("poping from stack 1");
			System.out.println(s.popStack2());
		}

	}
	

}
