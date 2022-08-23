// How to Reverse a Number in Java
package com.bridgelabz;
import java.util.*;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		System.out.print("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num =sc.nextInt();
		int rev = 0;
		while(num != 0)
		{
			int remainder = num % 10;
			rev = rev * 10 + remainder;
			num = num/10;	
		}
		System.out.println("The reverse of the number is: "+rev);
	}

}
