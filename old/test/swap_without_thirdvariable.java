package test;

import java.util.Scanner;

public class swap_without_thirdvariable {

	public static void main(String[] args) {
		System.out.println("enter any two numbers num1 and num2");
		float num1, num2;
		Scanner reader = new Scanner(System.in);
		num1= reader.nextFloat();
		num2 = reader.nextFloat();
		
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		
		System.out.println("num1 = "+num1+ "  num2 = "+num2);

	}

}
