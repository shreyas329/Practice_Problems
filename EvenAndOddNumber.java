/*
 * Java Program to Display Even Numbers From 1 to 100
 * Java Program to Display Odd Numbers From 1 to 100
*/

package com.bridgelabz;

public class EvenAndOddNumber {

	public static void main(String[] args) {
		System.out.println("Odd numbers between 1 to 100:");
		for(int i=1; i<=100; i++)
		{
			if(i%2 != 0)
			{
				System.out.print(i+", ");
			}
		}
		System.out.println("\n\nEven numbers between 1 to 100:");
		for(int i=1; i<=100; i++)
		{
			if(i%2 == 0)
			{
				System.out.print(i+", ");
			}
		}

	}

}