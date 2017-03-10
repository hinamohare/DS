package sortingAlgorithms;

import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {
		
		int[] array;
		int arraySize;
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		arraySize = reader.nextInt();
		
		array = new int[arraySize];
		System.out.println("Enter integer array elements");
		for(int i=0; i<arraySize; i++)
		{
			array[i] = reader.nextInt();
		}
		
		MergeSort.doMergeSort(array);
		
		for(int i = 0; i<arraySize; i++)
		{
			System.out.print(array[i]+ " ");
		}
	}

}
