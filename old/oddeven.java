import java.util.Scanner;

public class oddeven {

	public static void main(String[] args) {
		int number;
		
		System.out.println("Enter any number");
		
		Scanner reader = new Scanner(System.in);
		number = reader.nextInt();
		
		if(number%2 == 0)
			System.out.println("The number is even");
		else
			System.out.println("The number is odd");

	}

}
