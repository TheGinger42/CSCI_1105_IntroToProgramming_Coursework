/*
Author: Troy Aiken
Date: 11/26/19
Class: introduction to programming
use method to return a format for integers.
*/
import java.util.Scanner;

public class Exercise6_37 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		System.out.print("Enter a number for width: ");
		int width = input.nextInt();
		
		System.out.print(format(number, width));
	}
	public static String format(int number, int width){
		String formattedNum = number + "";
		int num = formattedNum.length();
		for (int i = 0; i < width - num; i++){
			formattedNum = "0" + formattedNum;
		}
		return formattedNum;
	}
}