/**
Author: Troy Aiken
Class: Object-Oriented Programming
Date: 01-29-2020
**/

import java.io.File;
import java.util.Scanner;
import java.io.PrintWriter;
class Exercise12_15 {
	public static void main(String[] args) throws Exception {
		java.io.File file = new java.io.File("Exercise12_15.txt");
		if (file.exists()){
			System.out.println("File already exists.");
		}
		else{
			try(java.io.PrintWriter output = new java.io.PrintWriter(file);){
				int num = 100;
				for (int i = 1; i <= num; i++){
					int rando = (int)(Math.random() * 100);
					output.print(rando + " ");
					if (i % 10 == 0){
					output.println();
					}
				}
			}
		}
	}
}
