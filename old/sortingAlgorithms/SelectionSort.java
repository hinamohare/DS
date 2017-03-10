package sortingAlgorithms;

import java.util.Scanner;

public class SelectionSort {
public static void selectionSort(int[] inputArray, int arraySize)
{	int smallestIndex, temp;
	for(int i=0; i<arraySize-1; i++)
	{	
		smallestIndex = i;
		for(int j=i+1; j<arraySize; j++)
		{
			if(inputArray[smallestIndex] > inputArray[j])
			{
				smallestIndex =  j;
			}
		}
		
		temp = inputArray[smallestIndex];
		inputArray[smallestIndex] = inputArray[i];
		inputArray[i] =temp;
	}
}

}
