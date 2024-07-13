package com.practice;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableThread implements Callable{

	@SuppressWarnings("Un-Checked")
	public static void main(String[] args) throws Exception{

		CallableThread d = new CallableThread();
		
		ExecutorService executos = Executors.newFixedThreadPool(10);
		for(int i=0;i<15;i++) {
		Future s = executos.submit(d);
		System.out.println(s.get().toString());
		}
		executos.shutdown();
	}

	@Override
	public Object call() throws Exception {

		System.out.println("Call() - method will call");
		return "Success";
	}
	

}
