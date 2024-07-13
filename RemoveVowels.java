//Write a java program to remove all the Vowels from the string ?


package com.practice;

public class RemoveVowels {

	public static void main(String[] args) {

		String s= "Hello i Love my india";
		
		s=s.replaceAll("[aeiouAEIOU]", "");
		
		System.out.println(s);
	

}
}
