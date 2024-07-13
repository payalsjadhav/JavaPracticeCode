package com.practice;

public class Driver1 {
	
	void print(Player p) {
		System.out.println(p.id+ " " +p.age+ " "+p.name);
	}

	public static void main(String[] args) {

		Driver1 d = new Driver1();
		 Player p = new Player();
		 p.id = 101;
		 p.age = 23;
		 p.name = "Payal";
		 
		 d.print(p);
	}

}

class Player{
	int id;
	String name;
	int age;
	
}
