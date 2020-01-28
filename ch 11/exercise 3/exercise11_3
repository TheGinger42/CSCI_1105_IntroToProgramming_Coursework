/**
Author: Troy Aiken
Class: Object - Oriented Programming
date: 01-27-2020
**/
import java.util.Date;
import java.util.Scanner;
class Exercise11_3 {
	public static void main(String[] args) {
		Checking checking = new Checking(250, 1, 500, 4.5);
		Savings savings = new Savings(2, 500, 4.5);
		double amount = 300;
		System.out.println("Checking Account: " + checking.toString());
		checking.withdraw(amount);
		System.out.println("Withdraw $300");
		System.out.println("Balance: $" + checking.getBalance());
		amount = 1000;
		System.out.println("Withdraw $1000");
		checking.withdraw(1000);
		System.out.println("Deposit $1000");
		checking.deposit(amount);
		System.out.println("Balance: $" + checking.getBalance());
		System.out.println();
		System.out.println("Savings Account: " + savings.toString());
		System.out.println("Deposit $300");
		amount = 300;
		savings.deposit(amount);
		System.out.println("Balance: $" + savings.getBalance());
		System.out.println("Withdraw $300");
		savings.withdraw(amount);
		System.out.println("Balance: $" + savings.getBalance());
		amount = 1000;
		System.out.println("Withdraw $1000");
		savings.withdraw(amount);
		System.out.println("Balance: $" + savings.getBalance());
	}
}
