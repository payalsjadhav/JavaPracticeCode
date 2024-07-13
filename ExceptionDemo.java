package com.practice;

public class ExceptionDemo {

	public static void main(String[] args) {

		int i=2;
		int j=0;
		
		int nums[]= new int[5];
		String str = null;
		
		try {//Exception Occurs here
			j=18/i;
			System.out.println(str.length());
			System.out.println(nums[1]);
			System.out.println(nums[5]);
			
		}catch(ArithmeticException e) {//Handle the Exception
			System.out.println("Cannot divided by Zero "+e);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Stay in your limit.");
		}catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println(j);
		
		System.out.println("Bye");
	}

}
