package com.practice;

public class ThreadDemo1 implements Runnable{

	public static void main(String[] args) {

		ThreadDemo1 d1 = new ThreadDemo1();
		
		Thread t1 = new Thread(d1);
		t1.setPriority(Thread.MAX_PRIORITY);//10
		t1.setName("Thread-1");
		
		Thread t2 = new Thread(d1);
		t2.setPriority(Thread.MAX_PRIORITY);//5
		t2.setName("Thread-2");
		
		Thread t3 = new Thread(d1);
		t3.setPriority(Thread.MAX_PRIORITY);//1
		t3.setName("Thread-3");
		
		
		t1.start();
		t2.start();
		t3.start();

//		t1.run();
	}

	@Override
	public void run() {

		System.out.println("Thread Started..."+Thread.currentThread().getName());
		
//		Thread t = Thread.currentThread();
//		System.out.println(t.getName());
		
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Thread Completed..."+Thread.currentThread().getName());
	}

}
