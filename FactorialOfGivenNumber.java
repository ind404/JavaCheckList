package generic;

import java.util.Scanner;

public class FactorialOfGivenNumber {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner number = new Scanner(System.in);
		int n = number.nextInt();
		int factorial = GenericUtil.factorialOfNumber(n);
		System.out.println("The factorial of given number is " + factorial);

	}

}
