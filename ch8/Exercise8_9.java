/**
Author: Troy Aiken
Class: Intro to programming
Date: 12/19/19
Tic Tac Toe
*/
import java.util.Scanner;
class Exercise08_9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[][] tic = new String[3][3];
		for (int i = 0; i < tic.length; i++) {
			for (int j = 0; j < tic.length; j++) {
				tic[i][j] = " ";
			}
		}
		System.out.println("Lets play Tic Tac Toe!");
		
		for (int i = 0; i < 3; i++){
		System.out.println("-------------\n|   |   |   |");
			if (i == 2){
				System.out.println("-------------");
			}
		}	
		for (int i = 0; i < 9; i++) {				
			if (i % 2 == 0){
				System.out.print("Enter a row (0, 1, or 2) for player X: ");				
				int tac = input.nextInt();
				System.out.print("Enter a Column (0, 1, or 2) for player X: ");
				int toe = input.nextInt();				
				if (tic[tac][toe] == " "){
					tic[tac][toe] = "X";
				}
				
				else { 
					while (tic[tac][toe] == "X" || tic[tac][toe] == "O"){
						System.out.println("Space already taken.");
						System.out.print("Enter a row (0, 1, or 2) for player X: ");				
						tac = input.nextInt();
						System.out.print("Enter a Column (0, 1, or 2) for player X: ");
						toe = input.nextInt();
					}
				}
				if (tic[tac][toe] == " "){
					tic[tac][toe] = "X";
				}
			}
			else {
				System.out.print("Enter a Row (0, 1, or 2) for player O: ");
				int tac = input.nextInt();
				System.out.print("Enter a Column (0, 1, or 2) for player O: ");
				int toe = input.nextInt();
				if (tic[tac][toe] == " "){
					tic[tac][toe] = "O";	
				}
				else {
					while (tic[tac][toe] == "X" || tic[tac][toe] == "O"){
						System.out.println("Space already taken.");
						System.out.print("Enter a Row (0, 1, or 2) for player O: ");
						tac = input.nextInt();
						System.out.print("Enter a Column (0, 1, or 2) for player O: ");
						toe = input.nextInt();
						}
					}
					if (tic[tac][toe] == " "){
						tic[tac][toe] = "O";
					}				
			}	
		
			for (int g = 0; g < tic.length; g++) {
				System.out.print("\n-------------\n| ");
				for (int j = 0; j < tic.length; j++){				
					System.out.print(tic[g][j] + " | ");			
				}				
			}
			System.out.println("\n-------------");
		}
	}	
}
