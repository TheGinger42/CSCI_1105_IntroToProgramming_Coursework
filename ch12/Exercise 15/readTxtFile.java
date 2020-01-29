import java.util.Scanner;
import java.util.*;

class ReadData {
	public static void main(String[] args) throws Exception {
		java.io.File file = new java.io.File("Exercise12_15.txt");
		ArrayList<Integer> num = new ArrayList<Integer>();

		Scanner input = new Scanner(file);
		while(input.hasNextInt()){
			num.add(input.nextInt());
		}
		Collections.sort(num);
		System.out.println(num);
	}
}
