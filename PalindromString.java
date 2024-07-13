//Write a java program to check the given string is palindrome or not?
//madam
//liril
//java
//keep


package com.practice;

public class PalindromString {

	public static void main(String[] args) {

		String s = args[0];
		String s1="";

		for(int i=s.length()-1;i>=0;i--) {
			s1= s1+s.charAt(i);
		}
		
		if(s.equals(s1)) {
			System.out.println("It Is Palindrome");
		}else {
			System.out.println("It is not Palindrome");
		}
}
}


//2
//String s=args[0];
//StringBuffer sb = new StringBuffer(s);
//sb.reverse();
//String s1= sb.toString();
//if(s.equals(s1)) {
//	System.out.println("It Is Palindrome");
//}else {
//	System.out.println("It is not Palindrome");
//}