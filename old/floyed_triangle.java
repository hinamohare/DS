import java.util.Scanner;
public class floyed_triangle {

	public static void main(String[] args) {
		System.out.println("Floyd triangle: ");
		int row, column, i ,j=1;
		System.out.print("Enter the number of rows: ");
		Scanner reader = new Scanner(System.in);
		row = reader.nextInt();
		
		for(i=1; i<=row; i++)
		{
			for(column=1; column <= i; column++)
			{
				System.out.print(j+ " ");
				j++;
			}
			System.out.println();
		}
	}

}
