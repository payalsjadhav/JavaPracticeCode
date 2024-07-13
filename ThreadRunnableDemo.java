package com.practice;

class N1 implements Runnable{
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

class N2 implements Runnable{
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
public class ThreadRunnableDemo {

	public static void main(String[] args) {

		Runnable obj1 = new N1();
		Runnable obj2 = new N2();

		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);

		t1.start();
		t2.start();
	}

}
