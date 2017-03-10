
public class ytrt {

	public static void main(String[] args) {
		int row =5;
		int space = 4;
		int i, j;
		for(i = 1; i <= row; i++)
		{
			for(j = 1; j <= i; j++)
			{
				System.out.print(i);
			}
			System.out.print("\n");
		}
		
		System.out.print("\n");
		for(i = 1; i <= row; i++)
		{
			for(j = 1; j <= space; j++)
			{
				System.out.print(" ");
			}
			space--;
			for(j = 1; j <= i; j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		space = 4;
		System.out.print("\n");
		for(i = 1; i <= row; i++)
		{
			for(j = 1; j <= space; j++)
			{
				System.out.print(" ");
			}
			space--;
			for(j = 1; j <= (2*i-1); j++)
			{
				System.out.print(i);
			}
			System.out.print("\n");
		}
		
		space = 0;
		System.out.print("\n");
		for(i = 1; i <= row; i++)
		{
			for(j = 1; j <= space; j++)
			{
				System.out.print(" ");
			}
			
			for(j = 1; j <= row-space; j++)
			{
				System.out.print("$");
			}
			System.out.print("\n");
			space++;
		}

	}

}
