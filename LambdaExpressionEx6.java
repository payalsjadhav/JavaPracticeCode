package com.practice;

interface Sayable2{
	String say(String msg);
}
public class LambdaExpressionEx6 {

	public static void main(String[] args) {

		Sayable2 p=(msg)->{
			String str1 = "I Would Like to Say, ";
			String str2 = str1 + msg;
			return str2;
		};
		System.out.println(p.say("time is precious"));
		
	}

}
