/* 
Author: Troy Aiken
Date: 11/18/19
class: Introduction to Programming
Find Perimeter of a Triangle. */

import java.util.Scanner;

public class Exercise3_19 {
	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	System.out.print("Enter side A: ");
	double a = input.nextDouble();
	System.out.print("Enter side B: ");
	double b = input.nextDouble();
	System.out.print("Enter side C: ");
	double c = input.nextDouble();
	
	double p = (a + b + c);
	
	if ((a + b <= c) || (b + c <= a) || (a + c <= b)) {
		System.out.print("Input is invalid");
			}
		
	else {
		System.out.println("Perimeter = " + p);
	}
	}
}