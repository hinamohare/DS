import java.util.Scanner;



public class arraysorting {

	public static void main(String[] args) {
		
		int A[] = new int[5];
		//Integer aa = null;
		
	 Integer age = null;
	try
	{
		System.out.println("Enter your age");
		Scanner reader = new Scanner(System.in);
		age = reader.nextInt();
		if(age > 0 && age < 20)
			System.out.println("You are a teenager");
		else if( age >19 && age <51)
			System.out.println("You are an adult");
		else if( age > 50 && age <110)
			System.out.println("You are old");
		else 
			System.out.println("You have entered invalid age");
	}
	catch (Exception e){
		System.err.print("Exception occured: "+e.getMessage());
	}
		
	}

}
