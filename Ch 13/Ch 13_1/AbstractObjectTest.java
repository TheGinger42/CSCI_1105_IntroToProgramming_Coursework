/**
Author: Troy Aiken
Class: Object-Oriented Programming
Date: 01-30-2020
**/
import java.util.Scanner;
import java.util.Date;
class AbstractObjectTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number for Side 1: ");
		double side1 = input.nextDouble();
		System.out.println("Enter a number for Side 2: ");
		double side2 = input.nextDouble();
		System.out.println("Enter a number for Side 3: ");
		double side3 = input.nextDouble();
		
		GeometricObject triangle = new Triangle(side1, side2, side3);
		System.out.println("What color is the Triangle? ");
		String color = input.next();
		triangle.setColor(color);
		System.out.println("Is the Triangle filled? y/n");
		String isIt = input.next();
		boolean filled;
		if (isIt.equalsIgnoreCase("y")){
			filled = true;
			}
			else{
				filled = false;
			}
		triangle.setFilled(filled);
		System.out.println("A Triangle " + triangle.toString());
		System.out.println("The color is " + triangle.getColor());
		System.out.println("The Area is " + triangle.getArea());
		System.out.println("The Perimeter is " + triangle.getPerimeter());

		
	}
}
