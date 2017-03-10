package CTCI;

import java.util.HashMap;
import java.util.Scanner;

public class Array1 {

	private static Scanner reader;

	public static void main(String[] args) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		String inputString = new String();
		reader = new Scanner(System.in);
		System.out.println("Enter the input string");
		int c;
		boolean isUnique = true;
		int count, i ;
		inputString = reader.nextLine();
		for( i= 0; i<256; i++)
			map.put(i, 0);
		for( i=0; i< inputString.length(); i++)
		{
			c = inputString.charAt(i);
			count =(int) map.get(c);
			if(count!=0)
				{	
					isUnique = false;
					break;
				}
				
				
			map.put(c, 1);
			
		}
		if(isUnique)
			System.out.println("The string is unique");
		else
			System.out.println("The string is not unique");
		
	}

}
