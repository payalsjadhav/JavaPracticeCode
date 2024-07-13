package com.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class CollectionDemo {

	public static void main(String[] args) {

//		List can Have Duplicate value
		System.out.println("List Interface");
		List<Integer> num = new ArrayList<Integer>();
		num.add(9);
		num.add(2);
		num.add(6);
		num.add(2);
		num.add(8);
		
		for(int n:num) {
			int n1 = (Integer)n;
		System.out.println(n1);
		}
		
		System.out.println("--------------------------");
		System.out.println("Set - Hashset Interface");

//		Unique value Support,Doesn't support duplicate value,It is not sorted
		Set<Integer> nums = new HashSet<Integer>();
		nums.add(91);
		nums.add(21);
		nums.add(64);
		nums.add(24);
		nums.add(88);
		
		for(int n:nums) {
			int n1 = (Integer)n;
		System.out.println(n1);
		}
		
		System.out.println("---------------------------------");
		System.out.println("Set - TreeSet Interface");

//		IT is in the Sorted Support
		Set<Integer> num1 = new TreeSet<Integer>();
		num1.add(91);
		num1.add(21);
		num1.add(64);
		num1.add(24);
		num1.add(88);
		
		for(int n:num1) {
			int n1 = (Integer)n;
		System.out.println(n1);
		}
		
		
		System.out.println("---------------------------");
		System.out.println("Map - HashMap Interface");
//		Map is a collections of key and value pair,Key are unique we
		Map<String, Integer> stud = new HashMap<>();
		stud.put("Payal", 91);
		stud.put("Ayush", 45);
		stud.put("Manu", 67);
		stud.put("Manu", 89);
		stud.put("Prisha", 78);
		
		System.out.println(stud);
		System.out.println(stud.get("Payal"));
		System.out.println(stud.keySet());

		for(String key : stud.keySet()) {
			System.out.println(key + ":"+ stud.get(key));
		}
		
		System.out.println("----------------------");
		Map<String, Integer> stud1 = new Hashtable<>();

	}

}
