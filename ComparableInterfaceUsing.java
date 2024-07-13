package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableInterfaceUsing {

	public static void main(String[] args) {

		List<Student1> al = new ArrayList<>();
		al.add(new Student1(100,"Manu",5));
		al.add(new Student1(102,"Prisha",3));
		al.add(new Student1(101,"Monika",1));
		al.add(new Student1(105,"Payal",2));
		

		Collections.sort(al);
		
		for(Student1 s : al) {
		System.out.println(s);
		}
		
		System.out.println('c' + 'o' + 'd' + 'e');
	}

}
