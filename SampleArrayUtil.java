package com.bayamp.arrayutil;

public class SampleArrayUtil {

	public static int getTotal(int array[]) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		return sum;
	}

	public static int getMax(int[] inArray) {
		int maxValue = inArray[0];
		for (int i = 0; i < inArray.length; i++) {
			if (inArray[i] > maxValue) {
				maxValue = inArray[i];
			}
		}
		return maxValue;
	}

	public static boolean searchFind(int[] inArray, int Find) {
		boolean match = false;
		int i;
		for (i = 0; i <= inArray.length; i++) {
			if (inArray[i] == Find) {
				match = true;
				break;
			}

		}
		return match;
	}

	public static int getMin(int givarray[]) {
		int min = givarray[0];
		for (int i = 1; i <= givarray.length; i++) {
			if (givarray[i] < min) {
				min = givarray[i];

			}
		}
		return min;
	}

	public static void reverse(int[] input) {

	}
}
