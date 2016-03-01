package com.bayamp.arrayutil;

public class ReverseString {
	public static String reverse(String s) {
		String reverse = "";
		
		for (int i = s.length() - 1; i >= 0; i--) {
			reverse = reverse + s.charAt(i);
			System.out.println("Working phenomenon:" + reverse);
		}

		return reverse;
	}

}
