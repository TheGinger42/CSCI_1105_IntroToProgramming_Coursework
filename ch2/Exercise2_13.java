/* 
Author: Troy Aiken
Date: 11/14/2019

Financial application: compound value*/

import java.util.Scanner;
import javax.xml.xpath.*;
import java.time.temporal.*;

public class Exercise2_13 {
		public static void main(String[] args) {
		//create Scanner
		Scanner input = new Scanner(System.in);
		// variables
		interest = (1 + 0.00417);
		
		//prompt user to input monthly savings amount.
		System.out.print("Input your monthly saving amount: ");
		double msa = input.nextDouble();
		
		//equasion
		double av = msa * interest;
		
		System.out.println("After the sixth month, the account value is $" + av);