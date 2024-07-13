package com.practice;

interface sayable{
	public String say();
}
public class LambdaExpressionEx2 {

	public static void main(String[] args) {

		sayable s=()->{
			return "I have nothing to say....";
		};
		System.out.println(s.say());
	}

}
