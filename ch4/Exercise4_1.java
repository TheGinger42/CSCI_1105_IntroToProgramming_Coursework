/* 
Author: Troy Aiken
Date: 11/18/19
class: Introduction to Programming
Find area of a pentagon. */

import java.util.Scanner;


public class Exercise4_1 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the length from center to vertex: ");
		double r = input.nextDouble();
		double side = (2 * r) * (Math.sin(Math.PI / 5));
		double area = (5 * (Math.pow(side, 2))) / (4 * (Math.tan(Math.PI / 5)));
		System.out.println("The Area of a Pentagon is = " + area);

	}
}