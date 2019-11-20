/*
Author: Troy Aiken
Date: 11/20/19
Class: Introduction to Programming
numbers....
*/
import java.util.Scanner;


public class Exercise5_11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = 0;		
		for (int count = 100; count <= 200; count++){ //so long as count is >= 100 and <= 200 count +1
		if (count % 5 == 0 ^ count % 6== 0){                              //is count divisible by 5?
			System.out.print(count + " ");	
			number++;
			if (number % 10 == 0) {
				System.out.print("\n");
			}	     //print count
		}
	}
		
	}
}