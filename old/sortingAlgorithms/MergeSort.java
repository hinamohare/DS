package sortingAlgorithms;

public class MergeSort {
	static int[] array; //array holds reference to the original input array so that the input array can be accessed across all the functions
	static int[] tempArray; //referenceArray holds the original array elements for sorting purpose
	static int sizeOfArray; //size of the original array
	
	//this function receives the original array in inputArray
	public static void doMergeSort(int[] inputArray)
	{	sizeOfArray = inputArray.length;
		array = inputArray; //array is initialized to input array and now the array elements can be accessed using reference array 
		tempArray = new int[sizeOfArray];
		for(int i=0; i<sizeOfArray; i++)
		{
			tempArray[i] = array[i];
		}
		MergeSort.sort(0, sizeOfArray-1);
	}
	
	//this is recursive sort function which splits the array into arrays of only 1 field
	static void sort(int start, int end)
	{	
		if(end>start)
		{
			int middle = (start + end)/2;
			sort(start, middle);
			sort(middle+1, end);
			MergeSort.merge(start, middle, end);
		}
	}
	static void merge(int start, int middle, int end)
	{	
		
		int i= start, j= middle+1, k=start;
		while(i<=middle && j<=end)
		{
			if(tempArray[i]<tempArray[j])
			{
				array[k]=tempArray[i];
				i++;
			}
			else
			{
				array[k]=tempArray[j];
				j++;
			}
			k++;
		}
		while(i<=middle)
		{
			array[k]=tempArray[i];
			i++;
			k++;
		}
		while(j<=middle)
		{
			array[k]=tempArray[j];
			j++;
			k++;
		}
	}
}
