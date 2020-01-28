/**
Author: Troy Aiken
Class: Object-Oriented Programming
Date: 01-28-2020
Create an array and check for exception.
**/
import java.util.Scanner;
class Exercise12_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//create array with 100 indexes
		int[] array = new int[100];
		
		//load array with random numbers
		for (int i = 0; i < array.length; i++){
			array[i] = (int)(Math.random() * 100);
		}
		//print the array
		try{
			for (int j = 0; j <= array.length; j++){
				System.out.print(j + ": " + array[j] + "\n");
			}
		}
		catch (IndexOutOfBoundsException ex){
			System.out.println("Out of Bounds");
		}	
	}
}
