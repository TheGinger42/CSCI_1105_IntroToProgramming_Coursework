/* 
Author: Troy Aiken
Date: 11/18/19
class: Introduction to Programming
using variables and user input to solve an equation. */

import java.util.Scanner;

public class Exercise3_3 {
	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	System.out.print("Enter A, B, C, D, E, F: ");
	double a = input.nextDouble();
	double b = input.nextDouble();
	double c = input.nextDouble();
	double d = input.nextDouble();
	double e = input.nextDouble();
	double f = input.nextDouble();
	
	double h = ((a * d) - (b * c));
	
	if (h == 0) {
		System.out.println("Cannot divide by 0");
	}
		else { 
		double x = (((e * d) - (b * f)) / h);
		double y = (((a * f) - (e * c)) / h);
		System.out.println("X = " + x);
		System.out.println("Y = " + y);
	}
	}
} 
