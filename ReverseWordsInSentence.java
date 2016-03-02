package com.bayamp;

public class ReverseWordsInSentence {
	public static void main(String args[]) {
		String s = " BayAmp Technlogies is in Santa Clara";
		String[] split = s.split(" ");
		String result = "";
		for (int i = split.length - 1; i >= 0; i--) {
			result += (split[i] + " ");
		}
		System.out.println(result.trim());
	}

}
