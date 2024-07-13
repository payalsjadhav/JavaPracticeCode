package com.practice;

class P1 extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
		System.out.println("Hii");
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
	}
}

class P2 extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
		System.out.println("Hello");
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
	}
}
public class ThreadDemo {

	public static void main(String[] args) {

		P1 obj1 = new P1();
		P2 obj2 = new P2();

		obj1.start();
		try {
			Thread.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		obj2.start();
	}

}
