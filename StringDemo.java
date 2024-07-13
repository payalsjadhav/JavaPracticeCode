package com.practice;

public class StringDemo {

	public static void main(String[] args) {

		String str = "Ashokit";
		String str2 = "Payal";
		
		String str3 = str.concat(str2);
		
		System.out.println(str3);
		
		char[] charArray=str.toCharArray();
		
		System.out.println(charArray);
		
		char charAt =str.charAt(0);
		System.out.println(charAt);
		System.out.println(str.length());
	}

}
