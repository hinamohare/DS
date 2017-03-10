package CTCI;

import java.util.Scanner;

public class Array2 {

	private static Scanner reader;


	static String reverseString(String str)
	{
		StringBuffer rString = new StringBuffer();
		int i;
		for( i=str.length()-1; i>=0; i--)
		{
			rString.append(str.charAt(i));
		}
		
		return rString.toString();
	}
	
	static String reverseStringInplace(String str)
	{
		StringBuffer rString = new StringBuffer(str);
		char c;
		int i =0, j = str.length()-1;
		while(i<str.length()/2)
		{
			c = rString.charAt(i);
			rString.setCharAt(i, rString.charAt(j));
			rString.setCharAt(j, c);	
			i++;
			j--;
		}
		return rString.toString();
	}
	
	
	public static void main(String[] args) {
		
		String str;
		reader = new Scanner(System.in);
		System.out.println("Enter string");
		
		str = reader.nextLine();
		System.out.println("The reversed string using BufferString is: "+Array2.reverseString(str));
		System.out.println("The reversed string using inplace algorithm is: "+Array2.reverseStringInplace(str));
	}

}
