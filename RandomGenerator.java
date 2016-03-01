package com.bayamp;

public class RandomGenerator {
	public static void main(String[] args) {
		java.util.Random dice = new java.util.Random();
		int number;
		for (int i = 0; i < 15; i++) {
			number = 1 + dice.nextInt(20);
			System.out.println(number);
		}

	}

}
