package exercise17_7;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rmazorow
 */
import java.io.*;

public class Exercise17_07 {
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        Loan loan1 = new Loan();
        Loan loan2 = new Loan(1.8, 10, 10000);
        Loan loan3 = new Loan(4.5, 20, 5000);
        try (
                ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("Exercise17_07.dat"));
        ) {
            output.writeObject(loan1);
            output.writeObject(loan2);
            output.writeObject(loan3);
        } 
        catch (IOException ex) {
            System.out.println("File could not be opened");
        }
        outputData();
    }
    public static void outputData() throws IOException, ClassNotFoundException{
    	int count = 0;
    	double total = 0;
    	try (
    			ObjectInputStream input = new ObjectInputStream(new FileInputStream("Exercise17_07.dat"))){
    		while (true) {
    			Loan loan = (Loan)(input.readObject());
    			double a = loan.getLoanAmount();
    			total = total + a;
    			count++;
    		}
    	}
    	catch(EOFException ex) {
    		System.out.println("The total number of loans is " + count);
    		System.out.println("The total loan amount is " + total);
    	}
    }
}
