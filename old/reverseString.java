import java.util.Scanner;
public class reverseString {
	public static void main(String args[])
	{
	String name, rname="";
	
	System.out.println("Enter any string");
	
	Scanner reader = new Scanner(System.in);
	
	name = reader.nextLine();
	
	int size = name.length();
	System.out.println("size of string :"+size);
	int i;
	for(i= size-1; i>=0; i--)
	{
		rname= rname + name.charAt(i);
	}
	System.out.println("The reversed string is : "+rname );
	}
}
