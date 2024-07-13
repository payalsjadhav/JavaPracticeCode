//write a java program to reverse a string

package com.practice;

public class ReverseStr {

	public static void main(String[] args) {

		String s="java";
		
		StringBuffer sb= new StringBuffer(s);
		sb.reverse();
		
		System.out.println(sb);
	}

}
//2
//String s = "java";
//String rev="";

//for(int i=s.length()-1;i>=0;i--) {
//	rev = rev+s.chatAt(i);
//}
//s.o.p(rev);


//3
//String s=args[0];
//char[]arr = s.tocharArray();
//String s1 = "";
//for(int i= arr.length-1;i>=0;i--) {
//	s1=s1+arr[i];
//}s.o.p(s1)