//write a java program to count the number of words in a String?

package com.practice;

public class CountString {

	public static void main(String[] args) {

		String s = "I   Love    Java       Programming";
		String []arr = s.trim().split("\\s+");
		System.out.println(arr.length);
	}

}
