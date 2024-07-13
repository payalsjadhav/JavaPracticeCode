package com.practice;

public class Student1 implements Comparable<Student1>{

	int id;
	String name;
	int Rank;
	
	
	public Student1(int id, String name, int rank) {
		super();
		this.id = id;
		this.name = name;
		Rank = rank;
	}


	@Override
	public int compareTo(Student1 s) {

		return this.id - s.id;

//		return this.name.compareTo(s.name);
		
//		return this.Rank - s.Rank;
	}
	
	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + ", Rank=" + Rank + "]";
	}
	
	
}
