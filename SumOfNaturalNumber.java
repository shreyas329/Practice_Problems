//Java Program to Find Sum of Natural Numbers
package com.bridgelabz;
import java.util.*;

public class SumOfNaturalNumber {

	public static void main(String[] args) {
		int total=0;
		System.out.print("Enter the limit of number : ");
		Scanner sc = new Scanner(System.in);
		int limit = sc.nextInt();
		for (int i=0; i<=limit; i++)
		{
			total = total+i;
		}
		System.out.print("\nThe sum is : "+total);
	}

}
