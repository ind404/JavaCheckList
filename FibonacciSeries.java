package generic;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		System.out.println("Enter number");
		Scanner input = new Scanner(System.in);
		long number = input.nextInt();
		long fibonacciseries = GenericUtil.fibonacciSeries(number);

	}

}
