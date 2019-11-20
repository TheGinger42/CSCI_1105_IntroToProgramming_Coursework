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
		double ftax = .2;
		double stax = .05;
		double oT = hours - 40;
		double oTrate = rate * 1.5;
		double gross = (hours * rate) + (oT * oTrate);
		double fedTax = gross * ftax;
		double stateTax = gross * stax;
		double net = gross - (fedTax + stateTax); 
		double deduction = stateTax + fedTax;
		
		System.out.println("Employee Name: " + emp);
		System.out.println("Regular Hours Worked: " + hours);
		System.out.println("Overtime hours: " + oT);
		System.out.println("Pay Rate: " + rate);
		System.out.println("Overtime Pay Rate: " + oTrate);
		System.out.printf("Gross Pay %.2f\n", gross);
		System.out.println("Deductions:");
		System.out.printf("	Federal Withholding: $%.2f\n", fedTax);
		System.out.printf("	State Withholding: $%.2f\n", stateTax);
		System.out.printf("	Total Deduction: $%.2f\n", deduction);
		System.out.printf("Net Pay: %.2f", net);
	}
}
