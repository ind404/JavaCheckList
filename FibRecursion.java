package generic;

import java.util.Scanner;

public class FibRecursion {
	public static void main(String[] args) {
		System.out.println("Enter number");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		for (int i = 0; i <=number; i++) {
			
			System.out.println(GenericUtil.fibRecursion(i));

		}

	}
}
