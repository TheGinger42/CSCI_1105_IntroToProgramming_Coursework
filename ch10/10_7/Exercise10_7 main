/**
Author: Troy Aiken
Class: Object_Oriented Programming
Date:01/22/2020
**/
import java.util.Scanner;
class  Exercise10_7{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int id = 0;
		int balance = 100;
		
		Account[] account = new Account[10];
		for (int i = 0; i < account.length; i++){
			account[i] = new Account(id, balance, 2.5);
			id++;
		}
		enterID(account);
	}
	
	public static void enterID(Account[] account){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an ID#: ");
		int iD = input.nextInt();
		while(iD > account.length - 1){
		System.out.println("Please enter a valid ID#: ");
		iD = input.nextInt();
		}
		menu(account, iD);
		
	}
	public static void menu(Account[] account, int iD){
		Scanner input = new Scanner(System.in);
		int menu = 0;
		while (menu != 4){
			System.out.println("Main Menu");
			System.out.println("1. Check Balance \n2. Withdraw \n3. Deposit \n4. Exit ");
			menu = input.nextInt();
		
				if (menu == 1){
					System.out.println("Balance: $" + account[iD].getBalance());
				

				}
				else if(menu == 2){
					System.out.println("How much would you like to withdraw?");
					double amount = input.nextDouble();
					while(amount > account[iD].getBalance()){
						System.out.println("Invalid amount. Please enter a valid amount.");
						amount = input.nextDouble();	
					}
					account[iD].withdraw(amount);
				
				}
				else if(menu == 3){
					System.out.println("How Much would you like to deposit?");
					double amount = input.nextDouble();
					account[iD].deposit(amount);
				}
				else {
					enterID(account);
				}
			}
	}
}
