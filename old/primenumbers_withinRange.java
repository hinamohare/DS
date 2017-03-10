import java.util.Scanner;


public class primenumbers_withinRange {

	public static void main(String[] args) {
		int R1, R2, i, j;
		System.out.println("Enter the range for the prime numbers");
		Scanner reader = new Scanner(System.in);
		R1 = reader.nextInt();
		R2 = reader.nextInt();
		for( i = R1;  i<= R2;  i++)
		{
			
			for( j=2; j<i; j++)
			{
				if(i%j == 0)
					break;
			}
			if ( i == j)
				System.out.print(i+ " ");
		}
		
		System.out.println("\nEnter any number");
		int number;
		number = reader.nextInt();
		for(i=2; i<number; i++)
		{
			
			if(number%i == 0)
				break;
		}
		if(number == i)
			System.out.println("The number is prime");
		else
			System.out.println("The number is not prime");
	}

}
