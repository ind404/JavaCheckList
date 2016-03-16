package com.bayamp.arrayutil;

public class RemDup {
	public static void main (String[] args){
		int array[] = {1,2,1,3,2};
		int rd[] = RemoveDuplicate.removeDuplicates(array);
		for (int i=0; i<=array.length;i++){
		System.out.println(rd[i]);
	}
		System.out.println("Duplicates are removed");
}
}
