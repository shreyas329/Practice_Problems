package com.bridgelabz;

import java.util.*;

public class CountOfVowelAndConsonant {

	public static void main(String[] args) {
		int consonant = 0;
		int vowel = 0;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.next();
	
		for(int i=0; i<str.length(); i++)
		{
			count++;
			if(str.charAt(i) == 'a')
			{
				vowel++;
			}
			else if(str.charAt(i) == 'e')
			{
				vowel++;
			}
			else if(str.charAt(i) == 'i')
			{
				vowel++;
			}
			else if(str.charAt(i) == 'o')
			{
				vowel++;
			}
			else if(str.charAt(i) == 'u')
			{
				vowel++;
			}
			else
			{
				consonant++;
			}
			
		}
		System.out.println(count);
		System.out.println("Vowels in the string is: "+vowel+"\nConsonants in the string is : "+consonant);
	}

}
