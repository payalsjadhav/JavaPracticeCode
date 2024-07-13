package com.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResources {

	public static void main(String[] args) throws NumberFormatException, IOException {

		int num = 0;
		BufferedReader bf = null;
		
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			bf = new BufferedReader(isr);
			num =Integer.parseInt(bf.readLine());
			System.out.println(num);
		}
		finally {
			bf.close();
		}
	}

}
