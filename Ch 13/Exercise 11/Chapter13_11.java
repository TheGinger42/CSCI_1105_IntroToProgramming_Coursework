/**
 * Author: Troy Aiken
 * Class: Object-Oriented Programming
 * Date: 02-04-2020
 * Clone and Compare Objects.
 */

package octagon;

public class Chapter13_11 {
	public static void main(String[] args) {
	Octagon shape1 = new Octagon(4);
	Octagon shape2 = shape1;
	System.out.println(shape1.compareTo(shape2));
	System.out.println("The area of the Octagon is: " + shape1.getArea());
	}
}
