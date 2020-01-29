/*
Author: Troy Aiken
Class: Introduction to Programming
Date: 12/17/19
*/

import java.util.Scanner;
class Exercise07_23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//100 boolean elements
		boolean[] lockers = new boolean[100];
		
		
		for (int i = 0; i < lockers.length; i++) {
			for (int j = 0; j < lockers.length; j++){
				if ((j + 1) % (i + 1) == 0) {
					lockers[j] = !lockers[j];
				}
			}
		}
		//print what lockers are open
		for (int i = 0; i < lockers.length; i++) {
			if (lockers[i] == true){
				System.out.println("Locker number " + (i + 1) + " is open");
			}
		}
	}
}
