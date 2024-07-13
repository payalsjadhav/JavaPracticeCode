package com.practice;

class Aa{
	int age;
	
	public void show() {
		System.out.println("In show");
	}
	
	class B{
		public void config() {
			System.out.println("Config");
		}
	}
}
public class InnerClass {

	public static void main(String[] args) {
		Aa a = new Aa();
		a.show();
		
		Aa.B obj = a.new B();
		obj.config();
		
//		if a inner class is Static then below way to create a object
//		Aa.B obj = new Aa.B();
	}

}
