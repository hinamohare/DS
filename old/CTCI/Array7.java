package CTCI;

import java.util.ArrayList;
import java.util.Scanner;

public class Array7 {

	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int m, n, i, j;
		System.out.println("Enter array dimensions m & n: ");
		m = reader.nextInt();
		n = reader.nextInt();
		int[][] array = new int[m][n];
		boolean[] row = new boolean[m];
		boolean[] column = new boolean[n];
		
		System.out.println("Enter array elements");
		for(i=0; i<m; i++)
		{
			for(j=0; j<n; j++)
			{
				array[i][j]= reader.nextInt();
			}
		}
		for(i=0; i<m; i++)
		{
			for(j=0; j<n; j++)
			{
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		
		for(i=0; i<m; i++)
		{
			for(j=0; j<n; j++)
			{
				if(array[i][j]== 0)
				{
					row[i] = true;
					column[j]= true;
				}
			}
		}
		
		for(i=0; i<m; i++)
		{
			if(row[i]==true)
			{
				for(int c=0; c<n; c++)
					array[i][c]=0;
			}
		}
		for(i=0; i<n; i++)
		{
			if(column[i]==true)
			{
				for(int r=0; r<m; r++)
					array[r][i]=0;
			}
		}
		
		System.out.println("The modified array is: ");
		for(i=0; i<m; i++)
		{
			for(j=0; j<n; j++)
			{
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}

	}

}
