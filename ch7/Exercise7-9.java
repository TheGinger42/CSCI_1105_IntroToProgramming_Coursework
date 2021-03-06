/*
Author: Troy Aiken
Class: Introduction to Programming
Date: 12/12/19
Use an Array to find the smallest element.
*/
import java.util.Scanner;

class Exercise07_9 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter 10 numbers separated by a space. ");
		
		double[] number = new double[10];
		for (int i = 0; i < 10; i++){
			number[i] = input.nextDouble();
		}
		
		System.out.println(min(number));
	}
	
	public static double min(double[] number) {
		double currentMin = number[0];
		for (int i = 0; i < number.length; i++) {
			double currentMinIndex = number[i];
			if (currentMin > currentMinIndex){
				currentMin = currentMinIndex;
			} 
		}
		return currentMin;
	}
}
