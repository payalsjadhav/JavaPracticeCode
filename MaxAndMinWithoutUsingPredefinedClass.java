//FIND MAX VALUE AND MIN VALUE WITHOUT USING PREDEFINED CLASS?
package com.practice;

public class MaxAndMinWithoutUsingPredefinedClass {

	public static void main(String[] args) {

		int arr[]= {4,5,8,2,9,6,11};
		
		int max= arr[0];//4
		int min= arr[0];//4
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {

				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("Max Number : "+max);
		System.out.println("Min Number: "+min);
	}

}
