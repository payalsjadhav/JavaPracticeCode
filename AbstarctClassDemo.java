package com.practice;

abstract class Car{
	public abstract void drive();
	public abstract void fly();
	public void playMusic() {
		System.out.println("Play Musing..");
	}
}
abstract class WagonR extends Car{

	@Override
	public void drive() {
		System.out.println("Driving..");
	}
	
}
class UpdatedWagonR extends WagonR{

	@Override
	public void fly() {

		System.out.println("Flying..");
	}
	
}

public class AbstarctClassDemo {

	public static void main(String[] args) {

		UpdatedWagonR obj = new UpdatedWagonR();
		obj.drive();
		obj.playMusic();
		obj.fly();
	}

}
