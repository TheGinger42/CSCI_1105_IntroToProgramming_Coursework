package exercise_1;
import java.io.IOException;
/**
 * Author: Troy Aiken
 * Class: Object-Oriented Programming
 * Date: 02/20/2020
 * Binary i/o
 */
import java.io.PrintWriter;
import java.io.File;
import java.io.FileWriter;
public class Exercise17_1{
	public static void main(String[] args) throws IOException {

		FileWriter file = new FileWriter("Exercise17_1.txt", true);

		try(
				PrintWriter output = new PrintWriter(file);
				){

			for ( int i = 0; i < 100; i++) {
				int rando = (int)(Math.random() * 100);
				output.print(rando + " ");

			}

		}
	}
}

