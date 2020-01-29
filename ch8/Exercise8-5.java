/**
Author: Troy Aiken
Class: Introduction to Programming
Date: 12/17/19
*/
import java.util.Scanner;
class Exercise08_5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double[][] a = {
			{1.0, 2.0, 3.0}, 
			{4.0, 5.0, 6.0}, 
			{7.0, 8.0, 9.0}};
		double[][] b = {
			{0.0, 0.2, 0.4}, 
			{1.0, 4.5, 2.2}, 
			{1.1, 4.3, 5.2}};
		
		double[][] c = addMatrix(a, b);
		for (int row = 0; row < a.length; row++) {
			for(int column = 0; column < a.length; column++) {
				System.out.print(c[row][column] + " ");
			}
			System.out.println();
		}
				
	}
	
	public static double[][] addMatrix(double[][] a, double[][] b) {
	 	double[][] c = new double[3][3];
		for (int row = 0; row < a.length; row++) {			
			for (int column = 0; column < a.length; column++){
				c[row][column] = a[row][column] + b[row][column];	
			}	
		}
		
		return c;
	}
}
