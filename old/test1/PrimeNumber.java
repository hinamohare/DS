package test1;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println(PrimeNumber.is_prime(19));

	}
	public static boolean is_prime(int number)
	{	
		for(int i = 2; i <= number / 2; i++)
		{
			if( number % i == 0)
				return false;
		}
		return true;
	}
}
