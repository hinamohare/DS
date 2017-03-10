import java.util.Scanner;


public class matrix_multiplication {

	public static void main(String[] args) {
		
		int a[][]= new int[2][2];
		int b[][]= new int[2][2];
		int c[][]= new int[2][2];
		int i,j,k;
		System.out.println("Enter the arrays to be multiplied");
		System.out.println("Enter the array A");
		for(i=0; i<2; i++)
			for(j=0; j<2; j++)
			{
				Scanner reader = new Scanner(System.in);
				a[i][j] = reader.nextInt();
			}
		System.out.println("Enter the array B");
		for(i=0; i<2; i++)
			for(j=0; j<2; j++)
			{
				Scanner reader = new Scanner(System.in);
				b[i][j] = reader.nextInt();
			}
		
		System.out.println("\nThe entered arrays are");
		System.out.println("A: ");
		for(i=0; i<2; i++)
			{for(j=0; j<2; j++)
			 {
				System.out.print(" "+a[i][j]);
			 }
			System.out.print("\n");
			}
		System.out.println("B: ");
		for(i=0; i<2; i++)
		{	for(j=0; j<2; j++)
			{
			System.out.print(" "+b[i][j]);
			}
			System.out.print("\n");
		}
		
		for(i=0; i<2; i++)
		{	for(j=0; j<2; j++)
			{
				for(k=0; k<2; k++)
				{
					c[i][j] = c[i][j]+ a[i][k]*b[k][j];
				}
			}
		}
		System.out.println("The product array is C: ");
		for(i=0; i<2; i++)
		{	for(j=0; j<2; j++)
			{
			System.out.print(" "+c[i][j]);
			}
			System.out.print("\n");
		}
	}

}
