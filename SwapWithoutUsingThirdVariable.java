//Write a java program to swap a two string without using third variable?


package com.practice;

public class SwapWithoutUsingThirdVariable {

	public static void main(String[] args) {

		String a = "Java";//4
		String b = "Program";//7
		
		a=a+b;//11
		
		b=a.substring(0, a.length()-b.length());//(0,4) java
		
		a=a.substring(b.length());//program
		
		System.out.println("a =" +a);
		System.out.println("b =" +b);
	}

}
