package com.practice;

class Abc{
	
	public void show() throws ClassNotFoundException{
		
		Class.forName("ExceptionDemo1");
	
	
	}
	
}
public class ExceptionDemo1 {

	static {
		System.out.println("Class Loaded..");
	}
	public static void main(String[] args) {

		Abc obj = new Abc();
		try {
			obj.show();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
