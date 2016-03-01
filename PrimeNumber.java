package generic;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner number = new Scanner(System.in);
		int n = number.nextInt();
		boolean test = GenericUtil.primeNumber(n);
		System.out.println("It is prime number ? " + test);

	}
}
