/*
Author: Troy Aiken
Date: 11/25/19
Class: introduction to programming
use reversal to define a palandrone.
*/
import java.util.Scanner;
public class Exercise6_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int n = input.nextInt(); 			
						
		System.out.println(n);
		
		reverseNumber(n);
	
	}		
	public static void reverseNumber(int n) {
				
		int reversed = 0; 
		int number; 
		int oI = n;
		
		while (n != 0) {
		number = n % 10;
		reversed = reversed * 10 + number;
		n /= 10;
						
		}
		System.out.println(reversed);
		if (oI == reversed) {
			System.out.println(oI + " is a palindrome.");
		}
		else {
			System.out.println(oI + " is not a palindrome.");
		}
	}				
}	
