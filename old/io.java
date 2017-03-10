    import java.io.*;
    import java.util.Scanner;
    import java.util.regex.*;

    public class io
    {
       public static void main(String[] args){
    	  Scanner s = new Scanner(System.in);
    	  
    	  String string = s.nextLine();
    	  System.out.println(string);
    	  
    	  System.out.println(s.hasNext());
    	  
    	  string = s.nextLine();
    	  System.out.println(string);
       }
    }