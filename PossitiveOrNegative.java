//Java Program to Check if a Number is Positive or Negative
package com.bridgelabz;
import java.util.*;

public class PossitiveOrNegative {

	public static void main(String[] args) {
		System.out.print("Enter a number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num>0)
		{
			System.out.print("\nThe entered number "+num+" is a possitive integer.");
		}
		else
		{
			System.out.print("\nThe entered number "+num+" is a negative integer.");
		}
	}

}
