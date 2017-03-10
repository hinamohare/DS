package test1;

public class Fibonacci {

	public static void main(String[] args)
	{
		Fibonacci.fibonacci_without_recursion(10);
		int fibo = Fibonacci.fibonacci_with_recursion(10);
		System.out.print("\n"+fibo);

	} 
	 public static void fibonacci_without_recursion(int n){
		if (n == 0)
		{ 
			System.out.println(0);
			return;
		}
		int first = 0, second = 1;
		int current = 0;
		System.out.print(first+" ");
		System.out.print(second+" ");
		if (n > 1)
		{ 
			for (int i = 2; i <= n; i++)
			{
				current = first + second ;
				System.out.print(current+" ");
				first = second;
				second = current;
			}
		}
		return ;
	}
	 public static int fibonacci_with_recursion(int n)
	 {
		 if (n == 0)
			 return 0;
		 else if (n == 1)
			 return 1;
		 else return Fibonacci.fibonacci_with_recursion(n-1)+ Fibonacci.fibonacci_with_recursion(n-2);
	 }
	

}
