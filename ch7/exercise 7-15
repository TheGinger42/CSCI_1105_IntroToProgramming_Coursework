package array1;
/*
Author: Troy Aiken
Class: Introduction to Programming
Date: 12/16/19
 */

import java.util.Scanner;
class Exercise07_15 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter 10 numbers separated by a space. ");

		int[] list = new int[10];
		for (int i = 0; i < 10; i++){
			list[i] = input.nextInt();
		}

		int[] list2 = eliminateDuplicates(list);	
		System.out.print("Array without duplicates ");
		for(int i: list2){
			System.out.print(i + " ");
		}

	}
	public static int[] eliminateDuplicates(int[] list) {	
		int[] newList = new int[list.length];
		boolean flag = false;
		int counter = 0;

		for (int i = 0; i < list.length; i++){
			for (int j = 0; j < list.length; j++){
				if (list[i] == newList[j]){
					flag = true;
				}
			}
			if(!flag){
				newList[counter] = list[i];
				counter++;

			}
			else{
				flag = false;
			}
		}
		System.out.println("The number of distinct numbers is " + counter);
		int[] last = new int[counter];
		for (int i = 0; i < last.length; i++){
			last[i] = newList[i];
		}
		return last;
	}
}
