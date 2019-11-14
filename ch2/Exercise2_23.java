/* 
Author: Troy Aiken
Date: 11/14/2019
class: Introduction to Programming
Calculate the cost of driving
*/

import java.util.Scanner;

public class Exercise2_23 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the driving distance in miles: ");
		double distance = input.nextDouble();
		System.out.print("Enter miles per gallon: ");
		double mpg = input.nextDouble();
		System.out.print("Enter price per Gallon: ");
		double ppg = input.nextDouble();
		double cost = (distance / mpg) * ppg;
		
		System.out.println("The cost of driving is " + cost);
	}
}