package dataStructures;
import java.util.Scanner;

import dataStructures.LinkedListStack;

public class StackOperations {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		LinkedListStack S = new LinkedListStack();
		System.out.println("Enter any string to  reverse");
		String string = new String(), reversedString = new String();
		Scanner reader = new Scanner(System.in);
		string = reader.nextLine();
		char[] array = string.toCharArray();
		int length = array.length, i=0;
		while(i<length)
		{
			S.push(array[i]);
			i++;
			
		}
		i =0;
		while(i<length)
		{
			array[i] = (char) S.top();
			S.pop();
			i++;
		}
		
		System.out.println(array);
		
	}

}
