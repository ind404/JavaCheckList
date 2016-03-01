package generic;

import java.util.Scanner;

public class FactorialRecursion {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner number = new Scanner(System.in);
		int n = number.nextInt();
		int factorial = GenericUtil.factorialWithRecursion(n);
		System.out.println("The factorial of given number is " + factorial);

	}
}