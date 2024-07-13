package com.practice;

class Calculator{
	
	int num=5;
	
	public int add(int n1,int n2) {
		return n1+n2;
	}
	
	public int add(int n1,int n2,int n3) {
		return n1+n2+n3;
		
	}
}
public class Addition {

	public static void main(String[] args) {

		
		Calculator calc = new Calculator();
		Calculator calc1 = new Calculator();

		int result=calc.add(2, 5);
		int r=calc.add(4, 5, 8);
		
		calc1.num=8;
		
		System.out.println(calc1);
		System.out.println(calc);
		
		System.out.println(result);
		System.out.println(r);
	}

}
