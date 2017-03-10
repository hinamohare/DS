package CTCI;

import java.util.Scanner;

public class Array3 {
	
	static boolean isPermutation(String str1, String str2)
	{	int L1 = str1.length(), L2 = str2.length(), c;
		if(L1!=L2)
			return false;
		int array[] = new int[255];
		for(int i=0; i<L1; i++)
		{
			c = str1.charAt(i);
			array[c]++;
		}
		for(int i=0; i<L2; i++)
		{
			c = str2.charAt(i);
			if((array[c]--)<0)
			{
				return false;
			}
			
		}
		return true;
	}
	public static void main(String[] args) {
		String str1, str2;
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the string 1: ");
		str1 = reader.nextLine();
	
		System.out.println("Enter the string 2: ");
		str2 = reader.nextLine();
		System.out.println("string 2 is permutation of string 1 ? \nAnswer: "+ Array3.isPermutation(str1, str2) );
	}

}
