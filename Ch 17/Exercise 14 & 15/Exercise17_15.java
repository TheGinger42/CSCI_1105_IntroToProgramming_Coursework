package chapter17_14;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
public class Exercise17_15 {
	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Encrypted file name: ");
		String encryptedFile = input.next();
		System.out.println("Enter a new file name for the Decrypted file: ");
		String decryptedFile = input.next();
		File file1 = new File(encryptedFile);
		DataInputStream encrypted = new DataInputStream(new FileInputStream(file1));
		 try(
				 DataOutputStream decrypted = new DataOutputStream(new FileOutputStream(decryptedFile));){
			 while(true) {
				 decrypted.writeByte(encrypted.readByte() - 5);
			 }
		 }
			 catch (EOFException ex) {
				 System.out.println("Decryption complete");
				 
			 }
			 catch(IOException ex) {
				 ex.printStackTrace();
			 }
		 encrypted.close();
		 input.close();
		 
	}

}
