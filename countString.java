package com.practice;

import java.util.HashSet;
import java.util.Set;

public class countString {

	public static void main(String[] args) {

		String str =" Hello World";

		countString c = new countString();
		int s1 = c.countSubString(str);
		
		System.out.println("The String"+str+" Substring is "+s1);
		
		
	}
	
	public int countSubString(String str) {
		int length = str.length();
		
		Set<String> set = new HashSet<String>();
		
		for(int i=0;i<=length;i++) {
			for(int j=i;j<=length;j++) {
				set.add(str.substring(i,j));
			}
		}
		
		int t1=set.size()+1;
		return t1;
	}

}
