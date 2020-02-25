package exercise9;
/**
 * Author: Troy Aiken
 * Class: Object-Oriented Programming
 * Date: 02/25/2020
 *recursion
 */
public class Exercise18_9 {
	public static void main(String[] args) {
		String message = "The proper and pendantic penguin purchased pangolin produced products";
		reverseDisplay(message);
	}
	public static void reverseDisplay(String a) {
		if ( a.length() > 0) {
			//char b = a.charAt(a.length());
			System.out.print(a.charAt(a.length()-1));
			reverseDisplay(a.substring(0, a.length() - 1));
		}
	}
}
