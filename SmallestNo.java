//Java Program to Find Smallest of Three Numbers Using Ternary Operator
package com.bridgelabz;
import java.util.*;

import java.util.Scanner;

public class SmallestNo {

	public static void main(String[] args) {
		System.out.print("Enter first number : ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		
		System.out.print("\nEnter second number : ");
		int num2 = sc.nextInt();
		
		System.out.print("\nEnter third number : ");
		int num3 = sc.nextInt();
		
		int temp = num1<num2?num1:num2;
		int smallest = num3<temp?num3:temp;
		System.out.println("The smallest number is: "+smallest);

	}

}
