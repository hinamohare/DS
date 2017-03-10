package CTCI;

import java.util.Scanner;

public class Array5 {

	private static Scanner reader;
	static String compress(String str)
	{
		StringBuffer newStr = new StringBuffer();
		int i, length = str.length(), count=1;
		char last = str.charAt(0);
		
		for(i=1; i<length; i++)
		{
			if(str.charAt(i)==last)
			{
				count++;
			}
			else
			{			
					newStr.append(last);
					
					if(count>1)
						newStr.append(count);				
				last = str.charAt(i);
				count = 1;
				
			
			}
		}
				newStr.append(last);
				if(count>1)
					newStr.append(count);			
		return newStr.toString();
	}
		
	public static void main(String[] args) {
		String str = new String();
	reader = new Scanner(System.in);
	System.out.println("Enter any string: ");
	str = reader.nextLine();
	System.out.println("The compressed string is: "+Array5.compress(str));

	}

}
