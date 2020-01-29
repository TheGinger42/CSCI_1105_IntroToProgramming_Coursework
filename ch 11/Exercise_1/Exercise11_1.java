/**
Author: Troy Aiken
Class: Object - Oriented Programming
Date: 01-27-2020
**/
import java.util.Date;
import java.util.Scanner;
class Chapter11_1{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean filled = false;
		System.out.println("Create a Triangle: Enter Side 1 measurment ");
		double side1 = input.nextDouble();
		System.out.println("Enter Side 2 measurment ");
		double side2 = input.nextDouble();
		System.out.println("Enter Side 3 measurement");
		double side3 = input.nextDouble();
		System.out.println("Whiat color is the Triangle?");
		String color = input.next();
		System.out.println("Is the Triangle filled with the color? Y/N");
		String isIt = input.next();
		if(isIt.equalsIgnoreCase("y")){
			filled = true;
		}
		Triangle triangle = new Triangle(side1, side2, side3, color, filled);
		System.out.println("A Triangle " + triangle.toString());
		System.out.println("The color is " + triangle.getColor());
		System.out.println("The Area is " + triangle.getArea());
		System.out.println("The Perimeter is " + triangle.getPerimeter());
	}
}
