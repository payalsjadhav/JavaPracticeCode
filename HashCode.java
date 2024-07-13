package com.practice;

public class HashCode {

	int age; //Insatance Variables
	
	public static void main(String[] args) {

		HashCode hs = new HashCode();
		hs.age = 20;
		System.out.println(hs.age);
		System.out.println(hs.hashCode());
		
		HashCode hs1 = new HashCode();
		System.out.println(hs1.age);
		System.out.println(hs1.hashCode());
		
		HashCode hs2 = new HashCode();
		System.out.println(hs2.hashCode());
	}

}
