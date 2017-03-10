import java.util.Scanner;
public class armstrong {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		int number, num;
		
		System.out.println("enter any number");
		number = reader.nextInt();
		int sum = 0, j;
		num = number; 
		while( num!=0)
		{ 
			j = num%10;
			num=num/10;
			sum= sum+ j*j*j;
			
		}
		
		if(sum == number)
			System.out.println("The number is armstrong");
		else
			System.out.println("The number is not armstrong");
	}

}
