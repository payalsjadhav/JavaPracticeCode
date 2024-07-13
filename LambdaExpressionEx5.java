package com.practice;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpressionEx5 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("Payal");
		list.add("Nilu");
		list.add("Sahmu");
		list.add("Gudiya");
		
		list.forEach(
				(n)->System.out.println(n)
				);
	}

}
