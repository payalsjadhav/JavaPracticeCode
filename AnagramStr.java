//Write a java program to check two strings are anagram or not?
//Keep & peek
//race&care


package com.practice;

import java.util.Arrays;

public class AnagramStr {

	public static void main(String[] args) {

		String s1 = args[0];
		String s2 = args[1];
		
		if(s1.length()!=s2.length()) {
			System.out.println("Given String are not Anagrams");
			return;
		}
		
		char a[] = s1.toCharArray();
		char b[] = s2.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		boolean flag = Arrays.equals(a, b);
		if(flag) {
			System.out.println("Given String are Anagram");
		}else {
			System.out.println("Given String are not Anagram");
		}
	}

}
