/*
Author: Troy Aiken
Date: 11/19/19
Class: Introduction to Programming
Death and Taxes*/

import java.util.Scanner;

public class Exercise4_23 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Employee's name: ");
		String emp = input.next();
		System.out.print("Enter number of hours worked: ");
		double hours = input.nextDouble();
		System.out.print("Enter hourly pay rate: ");
		double rate = input.nextDouble();
		System.out.print("Enter federal tax withholding rate: ");
		double ftax = input.nextDouble();
		System.out.print("Enter State tax withholding rate: ");
		double stax = input.nextDouble();
		double gross = hours * rate;
		double fedTax = gross * ftax;
		double stateTax = gross * stax;
		double net = gross - (fedTax + stateTax); 
		
		System.out.println("Employee Name: " + emp);
		System.out.println("Hours Worked: " + hours);
		System.out.println("Pay Rate: " + rate);
		System.out.println("Gross Pay: " + gross);
		System.out.println("Deductions:");
		System.out.printf("	Federal Withholding: (" + ftax * 100 + "%%): %.2f \n", fedTax);
		System.out.printf("	State Withholding (" + stax * 100 + "%%): %.2f\n", stateTax);
		System.out.printf("	Total Deduction: %.2f\n", (stateTax + fedTax));
		System.out.printf("Net Pay: %.2f", net);
	}
}
