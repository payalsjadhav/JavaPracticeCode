package com.practice;

class calc{
	public int add(int n1, int n2) {
		return n1+n2;
		
	}
}
class Advclac extends calc{
	
	//Overriding
	public int add(int n1,int n2) {
		return n1+n2+1;
	}
}
public class MethodOverridingDemo {

	public static void main(String[] args) {

		Advclac obj = new Advclac();
		int r1= obj.add(3, 7);
		System.out.println(r1);
		
		calc obj1 = new calc();
		int r = obj1.add(3, 9);
		System.out.println(r);
	}

}
