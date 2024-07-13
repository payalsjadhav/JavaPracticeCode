package com.practice;

interface Addable{
	int add(int a,int b);
}
public class LambdaExpressionEx4 {

	public static void main(String[] args) {

		Addable a1=(a,b)->(a+b);
		System.out.println(a1.add(10, 20));
		
		Addable a2=(int a,int b)->{
			return (a+b);
		};
		System.out.println(a2.add(20, 30));
	}

}
