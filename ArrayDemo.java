package com.practice;

public class ArrayDemo {

	public static void main(String[] args) {

		int nums[] = {6,5,4,7,8};//Single Dimensional Array
		nums[1]=9;
		for(int i=0;i<nums.length;i++) {
			
		System.out.println(nums[i]);
		}
		
		int num[][] = new int[3][4];//Multi Dimensional Array
		
		for(int i=0;i<3;i++) {
			for(int j=0; j<4;j++) {

				num[i][j]=(int)(Math.random()*10);
			}
		}
		
		for(int i=0;i<3;i++) {
			for(int j=0; j<4;j++) {
				System.out.print(num[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("----------------------------");
		for(int n[]:num) {
			for(int m:n) {
				System.out.print(m+" ");
			}
			System.out.println();
		}
		System.out.println("---------------------------");
		
		int arr[][] = {{2,3,4,5}, {6,7,8,9}, {10,11,12,13}};
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
