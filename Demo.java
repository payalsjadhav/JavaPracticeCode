package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class Demo {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		
		list.add("Payal");
		list.add("Manu");
		list.add("Prisha");
		list.add("Harshad");
		
		Stream<String> stream = list.stream();
		stream.filter(i -> i.startsWith("P")).forEach(System.out::println);
		
		List<Integer> nums = Arrays.asList(10,20,23,23,13,30,30,25,27);
		
//		nums.stream().filter(n -> n%2 == 0).forEach(System.out::println);
		
		Set<Integer> hs = new HashSet<Integer>();
		nums.stream().filter(n -> !hs.add(n)).forEach(System.out::println);
		
		nums.stream().sorted(Collections.reverseOrder()).forEach(System.out::print);
		
		String str1 = "Java";
		String rev = "";
		for(int i=0;i<str1.length();i++) {
			rev = str1.charAt(i)+rev;
		}
		System.out.println(rev);
		
		String str = "Hello world";
		char ch = 'l';
		int occur = countoccurence(str,ch);
		System.out.println("The Character:"+occur);
		
		int num[] = {1,3,5,4,8,7,9};
		int max=num[0];
		for(int i = 1;i<num.length;i++) {
			if(num[i]>max) {
				max = num[i];
				
			}
		}
		System.out.println("Largest Number:"+max);
		
		
		int n = 5;
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact*=i;
		}
		System.out.println("Factorial of "+n + " is "+fact);
		
//		System.out.println(Stringconst("Hello"));
	}


	public static int countoccurence(String str,char ch) {
		int count= 0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==ch) {
				count++;
				
			}
		}
		return count;
	

//		public static boolean Stringconst(String input) {
//			return input.toLowerCase().matches(".*[aeiou].*")
//		}
		
}
}

