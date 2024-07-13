package com.practice;

class A{
	public A() {
		super();
		System.out.println("In the A");
	}
	
	public A(int n) {
		super();
		System.out.println("In the A Integer");
	}
	
	public void show() {
		System.out.println("In A Show..");
	}
}
class B extends A{
	public B() {
		super();
		System.out.println("In the B");
	}
	public B(int n) {
		this();
		System.out.println("In the B Integer");
	}
}
public class ConstructorDemo {

	public static void main(String[] args) {

		B obj = new B(3);
		obj.show();
		
		
		System.out.println("--------------------");
		new B().show();//Anonymous object
		
	}

}
