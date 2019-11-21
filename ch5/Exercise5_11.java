/*
Author: Troy Aiken
Date: 11/21/19
Class: introduction to programming
Vowells, Consonants, and Strings
*/

import java.util.Scanner;
public class Exercise5_49 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print(" write a sentence: ");
		String line = input.nextLine();
		int vowels = 0;
		int con = 0;
		
		char ch = ' ';
		line = line.toLowerCase();
		System.out.println(line);
		for (int i = 0; i < line.length(); i++){  
		
			ch = line.charAt(i);
		
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'u' || ch == 'o'){
				vowels++;
			}
			else if (ch >= 'a' && ch <= 'z'){
				con++;
			}
		}
				
		System.out.println("number of vowels: " + vowels);
		System.out.println("number of consonants: " + con);
			
						
	}
}
