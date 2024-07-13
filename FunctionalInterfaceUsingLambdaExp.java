package com.practice;

@FunctionalInterface
interface N{
	int show(int i, int j);
}

public class FunctionalInterfaceUsingLambdaExp {

	public static void main(String[] args) {

		N obj = (i,j)-> i+j;//Lambda Expression

				int result = obj.show(4, 5);
			
				System.out.println(result);
				
				
//		N obj = new N() //AnonymousClass
//		{
//
//			@Override
//			public void show(int i) {
//				System.out.println("In show "+i);
//			}
//			
//		};
//
//		obj.show(5);
	}

}
