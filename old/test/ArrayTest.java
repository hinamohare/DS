package test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		//***************************************find missing number in an array************************************//
		/*int missingNumber;
		int[] array = new int[100];
		int value =1;
		int num;
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the number ");
		num = reader.nextInt();
		
		for(int i =0; i<100; i++)
		{
			if(i+1 == num)	
				array[i] = 0;
			
			else
			{
				array[i] = value;
				
			}
			value++;
			System.out.print(array[i]+" ");
		}
		missingNumber = ArrayTest.findMissingNumberInArray(array);
		System.out.println("The missing number is: "+missingNumber);
		*******************************************************************************************/
		
		/*
		 *****************reverse a number***********************************************************
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num = reader.nextInt();
		System.out.println("The reverse of "+num+" is "+ ArrayTest.reverseNumber(num));
		***********************************************************************************************
		*/
		/*
		 *********************remove duplicates from array*********************
		 
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter array size");
		int arraySize = reader.nextInt();
		
		int[] array =new int[arraySize];
		System.out.println("Enter array elements");
		for(int i =0; i < arraySize ; i++)
		{
			array[i]=reader.nextInt();
		}
		System.out.println("\nBefore removing duplicates\n");
		for(int i =0; i < arraySize ; i++)
		{
			System.out.print(array[i]+" ");
		}

		ArrayTest.removeDuplicates(array);
		System.out.println("\nAfter removing duplicates\n");
		for(int i =0; i < arraySize ; i++)
		{
			System.out.print(array[i]+" ");
		}
		*/
		
		/*
		 * ***********************************Reverse string using recursion*****************************************************8
		 
		 */
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter String");
		String word = reader.next();
		
		String reversedWord = new String();
		reversedWord = ArrayTest.reverseStringUsingRecursion(word);
		System.out.println(reversedWord);

	}
	//*************************reverse string using recursion******************************************
	public static String reverseStringUsingRecursion(String word)
	{	
		return ArrayTest.reverseString(word);	
	}
	public static String reverseString(String word)
	{
		if(word.length()==0)
			return word;

		return ArrayTest.reverseString(word.substring(1)) + word.charAt(0);
	}
	//**********************************find missing number******************************************8//
	public static int findMissingNumberInArray(int[] array)
	{	int number, i;
		int sum = 0, sumOfArrayElement=0;
		for(i=1; i<=100; i++)
			sum = sum + i;
		System.out.println("sum = "+sum);
		
		for(i=0; i< array.length; i++)
		sumOfArrayElement = sumOfArrayElement+ array[i];
		
		System.out.println("sumOfArrayElement = "+sumOfArrayElement);
		number = sum - sumOfArrayElement;
		return number;
	}
	//************************reverse an integer number*********************************//
	public static int reverseNumber(int number)
	{	int reverseNumber =0;
		while(number!=0)
		{
			reverseNumber = (reverseNumber*10 + number % 10);
			number = number / 10 ;
		}
		return reverseNumber;
	}
	//**************************remove duplicates***************************************//
	public static int[] removeDuplicates(int[] array)
	{
		int index=0;
		Arrays.sort(array);
		
		for(int i = 1; i< array.length; i++)
		{
			if(array[index]!= array[i])
			{	index++;
				array[index] = array[i];
			}
		}
		for(int i = index+1 ; i< array.length; i++)
		{
			array[i] = 	0;
		}
		return array;
	}
}
