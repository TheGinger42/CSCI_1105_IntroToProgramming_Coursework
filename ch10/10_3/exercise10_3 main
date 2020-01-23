/**
Author: Troy AIken
Class: Object-Oriented Programming
Date: 01/20/2020
**/

class MyIntegerTest {
	public static void main(String[] args) {
		MyInteger test = new MyInteger(10);
		MyInteger jet = new MyInteger(13);
		String stest = "1234578";
		char[] chars = {'1', '2', '3', '4', '5'};
		int myint = 9;
		
		// non-static
		System.out.println("Is the test value Even? " + test.isEven());
		System.out.println("Is the test value Odd? " + test.isOdd());
		System.out.println("Is the test value Prime? " + test.isPrime());
		
		// static int
		System.out.println("Is the static number Even? " + MyInteger.isEven(myint));
		System.out.println("Is the static number Odd? " + MyInteger.isOdd(myint));
		System.out.println("Is the static number Prime? " + MyInteger.isPrime(myint));
		System.out.println("Are the static and non-static numbers equal? " + test.equals(myint));
		
		// static MyInteger
		System.out.println("Is the Static object Even? " + MyInteger.isEven(jet));
		System.out.println("Is the Static object Odd? " + MyInteger.isOdd(jet));
		System.out.println("Is the Static object Prime? " + MyInteger.isPrime(jet));
		System.out.println("Are the 2 non-static numbers equal? " + test.isEqual(jet));


		// parse int
		System.out.println("Parse chars " + test.parseInt(chars));
		System.out.println("Parse string " + test.parseInt(stest));
	}
}
