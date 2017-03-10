package sortingAlgorithms;

public class InsertionSort {
public static void insertionSort(int[] inputArray, int arraySize)
{
	int temp, index, tempIndex;
	for(index =1; index < arraySize; index++)
	{
		if(inputArray[index] < inputArray[index-1])
		{
			temp = inputArray[index];
			inputArray[index] = inputArray[index-1];
			tempIndex = index-2;
			while( tempIndex>=0 && temp < inputArray[tempIndex] )
			{
				inputArray[tempIndex+1] = inputArray[tempIndex];
				tempIndex--;		
			}
			inputArray[tempIndex+1] = temp;
		}
	}
}
}
