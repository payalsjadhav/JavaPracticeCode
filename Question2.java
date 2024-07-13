package com.practice;

public class Question2 {

	public static void main(String[] args) {

		for(int i=0;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int k=4;k>=0;k--) {
			for(int l=1;l<=k;l++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
