/*
Author: Troy Aiken
Date: 11/14/2019
class: Introduction to programming	
convert Celcius to Fahrenheit.*/

import java.util.Scanner;

public class Exercise2_1 {
	public static void main(String[] args) {
		//create Scanner
		Scanner input = new Scanner(System.in);
			
		//prompt user for degree in Celcius
		System.out.print("Enter a number for Celcuis: ");
		double celcius = input.nextDouble();
		
		//compute Fahrenheit
		double fahrenheit = (9.0 / 5) * celcius + 32;
		
		//display results
		System.out.println(celcius + " degrees Celcius is " + fahrenheit + " degrees Fahrenheit");
			
	}
}
