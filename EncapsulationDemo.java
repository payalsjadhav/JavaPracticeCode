package com.practice;

class Human{
	private int age;
	private String name;
	
	public Human() {//Default Constructor
		age =12;
		name="Payal";
	}
	
	
	public Human(int a, String n) {//Paramerterised Constructor
		this.age=a;
		this.name=n;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
public class EncapsulationDemo {

	public static void main(String[] args) {

		Human h = new Human();
		
		h.setAge(24);
		h.setName("Payal");
		System.out.println(h.getName()+":"+h.getAge());
		
	}

}
