//write a java program to count the total number of occurrences of a given character in a string

package com.practice;

public class CharOccurances {

	public static void main(String[] args) {

		String s="java";
		char ch= 'a';
		
//		char[] arr = s.toCharArray();
//		int count= 0;
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]=='a') {
//				count++;
//			}
//		}
		
	
		int count= 0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a') {
				count++;
			}
		}
		System.out.println(count);
	}

}
