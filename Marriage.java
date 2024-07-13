package com.practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Marriage {

	public static void main(String[] args) throws Exception{

		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("Enter ypur age: ");
		String st1r=br.readLine();
		int age = Integer.parseInt(st1r);
		System.out.println("Enter your Salary:");
		String str2=br.readLine();
		double salary = Double.parseDouble(str2);
		
		if(age < 30 && salary  > 100000) {
			System.out.println("You are eligible for marriage");
		}else {
			System.out.println("You are not eligible for Marriage");
		}
	}

}
