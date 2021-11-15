package linear;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class ParenMatch {

	public static boolean parenMatch(String expr) {
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter expression, 'quit' to stop: ");
		String line = sc.nextLine();
		while (!"quit".equals(line)) {
			if (parenMatch(line)) {
				System.out.println("Matched!");
			} else {
				System.out.println("Did not match");
			}
			System.out.print("Enter expression, 'quit' to stop: ");
			line = sc.nextLine();
		}
		sc.close();
	}

}
