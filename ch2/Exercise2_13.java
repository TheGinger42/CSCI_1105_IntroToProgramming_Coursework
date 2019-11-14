/* 
Author: Troy Aiken
Date: 11/14/2019
Class: Introduction to Programing
Financial application: compound value*/

import java.util.Scanner;
import javax.xml.xpath.*;
import java.time.temporal.*;
import javax.print.attribute.standard.*;

public class Exercise2_13 {
		public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
	
		double interest = (1 + 0.00417);
		
		System.out.print("Input your monthly saving amount: ");
		
		double msa = input.nextDouble();
		double newBalance = 0.0;
		double oldBalance = 0.0;
		newBalance = msa * interest;
		oldBalance = newBalance;
		newBalance = (msa + oldBalance) * (interest);
		oldBalance = newBalance;
		newBalance = (msa + oldBalance) * (interest);
		oldBalance = newBalance;
		newBalance = (msa + oldBalance) * (interest);
		oldBalance = newBalance;
		newBalance = (msa + oldBalance) * (interest);
		oldBalance = newBalance;
		newBalance = (msa + oldBalance) * (interest);
		
		System.out.println("After the sixth month, the account value is $" + newBalance);
		}
}