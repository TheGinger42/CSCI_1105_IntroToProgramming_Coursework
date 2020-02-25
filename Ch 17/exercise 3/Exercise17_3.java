package exercise17_3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.*;
public class Exercise17_3 {
	public static void main(String[] args) throws IOException{
		dataOutput();
		dataInput();
	}
	public static void dataOutput() throws IOException{
		try(
				DataOutputStream output = new DataOutputStream(new FileOutputStream("Exercise17_03.dat"));
				){
			for (int i = 0; i < 100; i++) {
				int rando = (int)(Math.random() * 100);
				output.writeInt(rando);
			}
		}
	}
	public static void dataInput() throws IOException{
		int total = 0;
		int temp = 0;
		try(
		DataInputStream input = new DataInputStream(new FileInputStream("Exercise17_03.dat"))){
			while (true) {
				int a = input.readInt();
				temp = temp + a;
				total = temp;
				
				
			}
			
		}
		catch (EOFException ex) {
			System.out.print(" " + total);
		}
	}
}

