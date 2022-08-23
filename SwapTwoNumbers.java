//Java Program to Swap Two Numbers
package com.bridgelabz;
import java.util.*;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		int temp = 0;
		System.out.print("Enter first number : ");
		Scanner sc =new Scanner(System.in);
		int num1 = sc.nextInt();
		
		System.out.print("\nEnter second number : ");
		int num2 = sc.nextInt();
		
		System.out.println("\nBefore Swaping:\nFirst number = "+num1+"\tSecond number = "+num2);
		
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("\nAfter Swaping:\nFirst number = "+num1+"\tSecond number = "+num2);

	}

}
