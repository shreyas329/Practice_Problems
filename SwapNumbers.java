//Java Program to Swap Two Numbers Using Bitwise Operator
package com.bridgelabz;
import java.util.*;

public class SwapNumbers {

	public static void main(String[] args) {
		System.out.print("Enter first number : ");
		Scanner sc =new Scanner(System.in);
		int num1 = sc.nextInt();
		
		System.out.print("\nEnter second number : ");
		int num2 = sc.nextInt();
		
		System.out.println("\nBefore swaping:\nFirst number = "+num1+"\tSecond number is = "+num2);
		
		num1 = num1^num2;
		num2 = num2^num1;
		num1 = num1^num2;
		
		System.out.println("\nAfter swaping:\nFirst number = "+num1+"\tSecond number is = "+num2);

	}

}
