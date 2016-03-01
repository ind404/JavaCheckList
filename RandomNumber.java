package com.bayamp;

import java.util.Random;

public class RandomNumber {
	public static void main(String[] args) {
		int number;
		Random dice = new Random();
		for (int i = 0; i < 20; i++) {
			number = 1+ dice.nextInt(10);
			System.out.println(number);
		}

	}

}
