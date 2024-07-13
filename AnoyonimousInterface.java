package com.practice;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AnoyonimousInterface {

	public static void main(String[] args) {

		Runnable r = new Runnable() {//Anonynomous Interface

			@Override
			public void run() {

				System.out.println("Runnable Interface...");
			}
			
		};
		
		Thread t2 =  new Thread(r);
		t2.start();
		
		Callable c = new Callable() {

			@Override
			public Object call() throws Exception {
				System.out.println("Callable Interface....");
				return null;
			}
			
		};
			ExecutorService executos = Executors.newFixedThreadPool(10);
			
			executos.submit(c);
	
	}
	
}
