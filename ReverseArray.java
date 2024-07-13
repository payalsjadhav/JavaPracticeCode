//Write a java program to reverse an array

package com.practice;

public class ReverseArray {

	public static void main(String[] args) {

		int arr[] = {5,6,3,4,8,9,12};
		
		int temp=0;
		
		for(int i=arr.length-1; i>=0;i--) {
			arr[temp]=arr[i];
			temp++;
		}
		System.out.println(arr[temp]);
	}

}
