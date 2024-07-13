package com.practice;

public class Cricket {

	public static void main(String[] args) {

		Cricket c = new Cricket();
		Player1 p = c.m1(0);
		System.out.println(p.id+ " "+ p.name+" " + p.age);
	}
	
	Player1 m1(int id) {
		Player1 p = new Player1();
		
		if(id == 7) {
			p.id= 7	;
			p.name = "Dhoni";
			p.age = 40;
			
		}
		else if(id == 80) {
			p.id = 80;
			p.name = "Virat";
			p.age = 23;
			
		}else if(id == 45) {
			p.id = 45;
			p.name="Kohli";
			p.age= 35;
			
		}
		return p;
		
	}

}
class Player1{
	int id;
	String name;
	int age;
	
}
