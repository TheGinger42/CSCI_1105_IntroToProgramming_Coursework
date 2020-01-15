import java.util.concurrent.locks.*;

/*
Author: Troy Aiken
Class: Object-Oriented Programming
Date: 01/15/2020
*/

public class Rectangle9_1 {
	public static void main(String[] args) {
		
		
		Rectangle square1 = new Rectangle();
		Rectangle square2 = new Rectangle(4, 40);
		Rectangle square3 = new Rectangle(3.5, 35.9);
		
		System.out.println("The area of the rectangle - Width: " + square1.width + " Height: " + square1.height + " is " + square1.getArea());
		System.out.println("The parimeter of the rectangle - Width: " + square1.width + " Height: " + square1.height + " is " + square1.getParimeter());
		System.out.println("The area of the rectangle - Width: " + square2.width + " Height: " + square2.height + " is " + square2.getArea());
		System.out.println("The parimeter of the rectangle - Width: " + square2.width + " Height: " + square2.height + " is " + square2.getParimeter());
		System.out.printf("The area of the rectangle - Width: " + square3.width + " Height: " + square3.height + " is %3.2f", square3.getArea());
		System.out.println();
		System.out.println("The parimeter of the rectangle - Width: " + square3.width + " Height: " + square3.height + " is " + square3.getParimeter());
	}
}
class Rectangle {
	double width = 1;
	double height = 1;
	public Rectangle (){
		
	}
	public Rectangle(double newWidth, double newHeight){
		width = newWidth;
		height = newHeight;
	}
	
	public double getArea (){
		return width * height;
	}
	public double getParimeter(){
		return width + width + height + height;
	}
}
