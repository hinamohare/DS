package CTCI;

import java.util.Scanner;

public class Array8 {

	private static Scanner reader;
	static boolean SubString(String s1, String s2)
	{	String s3 = new String();
		s3 = s1 + s1;
		return s3.contentEquals(s2);
	}
	public static void main(String[] args) {

		String s1=new String(), s2= new String();
		reader = new Scanner(System.in);
		System.out.println("Enter the strings s1 and s2");
		s1 = reader.nextLine();
		s2 = reader.nextLine();
		System.out.println("s2 is substring of s1? \nAnswer: "+Array8.SubString(s1, s2));
	}

}
