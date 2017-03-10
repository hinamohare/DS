package test;

import java.util.Scanner;


class GFG {
	public static void main (String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.println("enter number of test cases");
    int testCaseCount = reader.nextInt();
    int index, arrayLength, innerIndex;
    int[] array;
    boolean found=false;
    for(int i=0; i< testCaseCount; i++)
    {   System.out.println("enter array size");
    	arrayLength = reader.nextInt();
        array = new int[arrayLength];
        System.out.println("enter array elements");
        for(index =0; index< arrayLength; index++ )
        {
            array[index] = reader.nextInt();
        }
        for(index =0; index< arrayLength-1; index++)
        {  innerIndex= i+1;
            while(innerIndex<arrayLength)
            {   if(array[index] < array[ innerIndex])
                {
                    found = true;
                    break;
                }
                innerIndex++;
            }
            if(found)
                System.out.print(array[innerIndex]+" ");
            else
                System.out.print(-1+" ");
        }
         System.out.println(-1);
    }
	}
}