
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Phone_directory  {

	public static void main(String[] args) throws Exception {
		 Scanner reader = new Scanner(System.in);
		 String[] colors = new String[10];
		 System.out.println("enter any color: r, g, b");
		 for(int i=0; i<10; i++)
		 {
			 colors[i] = reader.next();
		 }
		 
		 for(int i=0; i<10; i++)
		 {
			 if(colors[i].equals("r"))
				 {
				 	System.out.print(colors[i]+" ");
				 }
		 }

		 for(int i=0; i<10; i++)
		 {
			 if(colors[i].equals("g"))
				 {
				 	System.out.print(colors[i]+" ");
				 }
		 }

		 for(int i=0; i<10; i++)
		 {
			 if(colors[i].equals("b"))
				 {
				 	System.out.print(colors[i]+" ");
				 }
		 }
	}

}
