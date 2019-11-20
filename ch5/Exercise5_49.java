/*
Author: Troy Aiken
Date: 11/20/19
class: introduction to programming
vowells and consonants
*/

import java.util.Scanner;
public class Exercise5_49 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char temp;
		System.out.print("write a sentence: "); //user input
		String string = input.nextLine();
		int count = 0;
		for (int i = 0; i == string.length(); i++){
			temp = string.charAt(i);
		}
		if (temp.isLetter){
			count++;
		}
		if (temp != " "){
			
			
		}
			System.out.println(count);
				
	}
}
