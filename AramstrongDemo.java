package com.practice;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class AramstrongDemo {
	
	public static boolean isArmstrong(int num) {
		return num == getArmstrong(num);
	}
	
	public static int getArmstrong(int num) {
		
		int pow = String.valueOf(num).length();
		
		return IntStream.iterate(num, i-> i/10).limit(pow).map(i->(int)Math.pow(i%10,pow)).sum();
	}

	public static void main(String[] args) {

		System.out.println(getArmstrong(120));
		System.out.println(isArmstrong(120));
	}

}
