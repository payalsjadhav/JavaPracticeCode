package com.practice;

interface P{
	
//	class -class----> extends 
//	class -inteface----->implements
//	interface -interface------->extends
	
	int age=23;
	String city="Mumbai";//In Interface variables are final static by default
	
	void show();//In iterface methods are public abstract by default
	void config();
	
}
interface X{
	void run();
	
}

interface Y extends X{
	
}

class Ba implements P,Y{

	public void show() {
		System.out.println("In show");		
	}

	public void config() {
		System.out.println("In config");		
	}

	public void run() {

		System.out.println("Running..");
	}
	
}
public class InterfaceDemo{

	public static void main(String[] args) {

		P obj;
		obj = new Ba();
		obj.show();
		obj.config();
		X obj1 = new Ba();
		obj1.run();
		
	}

}
