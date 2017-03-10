import java.util.Scanner;


public class factorial {

	public static void main(String[] args) {
		int num, factorial = 1, i;
		System.out.println("enter the number whose factorial is to be found out");
		Scanner reader = new Scanner(System.in);
		num = reader.nextInt();
		System.out.print(factorial);
		for(i = 1; i<= num; i++)
		{	
			factorial = factorial * i;
			System.out.print(" * " +i);
		}
		System.out.println("\nThe factorial of the number " +num+ " is : " +factorial);
	}

}
