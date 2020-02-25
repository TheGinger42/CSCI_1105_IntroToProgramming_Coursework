package exercise3;
import java.util.Scanner;
public class Exercise18_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("To find the Greatest Common Divisor of 2 numbers \nEnter the Nominater: ");
		int a = input.nextInt();
		System.out.println("Enter the Denominator: ");
		int b = input.nextInt();
		int c = gcd(a,b);
		System.out.println("The Greatest Common Divisor of " + a + " and " + b + " is: " + c);
		input.close();
	}
	public static int gcd( int a, int b) {
		if (b != 0) {
			return gcd(b, a % b);
		}
		else {
			return a;
			
		}
	}
}
