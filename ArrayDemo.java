package corejava;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {

		int arr[] = {15,8,11,4,2,7,3};
		
		System.out.println("Arrays before sorting::");
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] +" " );
			
		}
		Arrays.sort(arr);
		
       System.out.println("Arrays After sorting::");
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] +" " );
			
		}
		
		System.out.println("Min Element:" + arr[0]);
		System.out.println("Max Element:" + arr[arr.length-1]);
	}

}
