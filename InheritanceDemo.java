package com.practice;

class A1{
	public void A() {
		System.out.println("In A");
	}
}
class B1 extends A1{
	public void abc() {
		System.out.println("In a abc");
	}
}
class C extends B1{
	public void show() {
		System.out.println("In Show");
	}
}
public class InheritanceDemo {

	public static void main(String[] args) {

		C obj = new C();
		obj.show();
		obj.abc();
	}

}
