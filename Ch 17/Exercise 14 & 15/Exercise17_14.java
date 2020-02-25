package chapter17_14;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
public class Exercise17_14 {
	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter file name to be encrypted: ");
		String toBeEncrypted = input.next();
		System.out.println("Enter a new name for the encrypted file: ");
		String newfile = input.next();
		File fileIn = new File(toBeEncrypted);
		DataInputStream file = new DataInputStream(new FileInputStream(fileIn));
		
		try(
		DataOutputStream output = new DataOutputStream(new FileOutputStream(newfile));) {
			
			while(true) {
				output.writeByte(file.readByte() + 5);
			}
		}
		catch (EOFException ex) {
			System.out.println("Encryption complete.");
		
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}
		input.close();
		file.close();
	}
}
