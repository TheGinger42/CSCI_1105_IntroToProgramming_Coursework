/**
Author: Troy Aiken
Class: Introduction to programming
Date: 12/18/19
Learn the state capitals!
*/
import java.util.Scanner;
class Exercise08_37 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int correct = 0;
		int incorrect = 0;
		
		//10 states and their capitals
		String[][] states = {
			{"Alabama", "Montgomery"}, 
			{"Alaska", "Juneau"}, 
			{"Arizona", "Phoenix"}, 
			{"Arkansas", "Little Rock"}, 
			{"California", "Sacramento"}, 
			{"Colorado", "Denver"}, 
			{"Connecticut", "Hartford"},
			{"Delaware", "Dover"}, 
			{"Florida", "Tallahassee"}, 
			{"Georgia", "Atlanta"}};
			//generate a state and user guesses the capital
		for (int i = 0; i < states.length; i++){
			
			System.out.print("What is the capital of " + states[i][0] + "?");
			System.out.println();
			String capital = input.nextLine();
				if  (capital.equalsIgnoreCase(states[i][1])) {
				correct++;				
				}				
				else if (!capital.equalsIgnoreCase(states[i][1])){
					incorrect++;													
				}
		}			
			System.out.println("Congratulations! \n You got " + correct + " correct! \n and " + incorrect + " incorrect");
	}	
}			
	
	
	
