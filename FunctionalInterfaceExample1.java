package com.practice;

interface Sayable3{
	void say(String msg);
	
	int hashcode();
	String toString();
	boolean equals(Object obj);
}
public class FunctionalInterfaceExample1 implements Sayable3{

	public static void main(String[] args) {

		FunctionalInterfaceExample1 fi = new FunctionalInterfaceExample1();
		fi.say("Hello Payal");
	}

	@Override
	public void say(String msg) {

		System.out.println(msg);
	}

	@Override
	public int hashcode() {
		// TODO Auto-generated method stub
		return 0;
	}

}
