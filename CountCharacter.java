package com.bridgelabz;

import java.util.*;

public class CountCharacter {

	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.next();
		for(int i=1; i<=str.length(); i++)
		{
			count++;
		}
		System.out.println("Total number of characters i the string is: "+count);
	}

}
