package com.practice;

public class Practice {

	public static void main(String[] args) {

		String str =" Hello World";
		
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		System.out.println(sb);
		
		String reverse=" ";
		int length = str.length();
		for(int i=0;i<length;i++) {
			reverse = str.charAt(i)+reverse;
			
		}
		System.out.println(reverse);
		
		
		
		for(int i=str.length()-1;i>=0;i--) {
			reverse = reverse +str.charAt(i);
		}
		System.out.println(reverse);
		
		
//		String s = "java";
//		String rev="";
//
//		for(int i=s.length()-1;i>=0;i--) {
//			rev = rev+s.charAt(i);
//		}
//		System.out.println(rev);
		
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		String s = "Hello My Friend";
		
		String [] arr = s.split(" ");
		
		for(int i=0;i<arr.length;i++) {
			String x = arr[i];
			
			StringBuffer sb1= new StringBuffer(x);
			sb1.reverse();
			System.out.print(sb + " ");
		}
	}

}
