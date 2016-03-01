package com.bayamp.arrayutil;

public class SearchFind {
	public static void main(String args[]) {
		int inputarray[] = { 2, 3, 4, 20 };
		int find = 20;
		boolean got = SampleArrayUtil.searchFind(inputarray, find);
		System.out.println("Value found :" + got);

	}
}