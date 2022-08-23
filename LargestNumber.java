//Java Program to Find Largest of Three Numbers
package com.bridgelabz;
import java.util.*;

public class LargestNumber {

	public static void main(String[] args) {
		System.out.print("Enter first number : ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		
		System.out.print("\nEnter second number : ");
		int num2 = sc.nextInt();
		
		System.out.print("\nEnter third number : ");
		int num3 = sc.nextInt();
		if(num1>num2 && num1>num3)
		{
			System.out.println("The largest number is : "+num1);
		}
		else if (num2>num1 && num2>num3)
		{
			System.out.println("The largest number is ; "+num2);
		}
		else
		{
			System.out.println("The largest number is : "+num3);
		}

	}

}
