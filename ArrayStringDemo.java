package com.practice;
class Student{
	int id;
	String name;
	int marks;
	
}
public class ArrayStringDemo {

	public static void main(String[] args) {

		Student s1=new Student();
		s1.id=1;
		s1.name="Payal";
		s1.marks=90;
		
		Student s2 =new Student();
		s2.id=2;
		s2.name="Prisha";
		s2.marks=80;
		
		Student s3=new Student();
		s3.id=3;
		s3.name="Mansvi";
		s3.marks=65;
		
		Student student[]=new Student[3];
		student[0]=s1;
		student[1]=s2;
		student[2]=s3;
		
		for(int i=0;i<student.length;i++) {//using for loop
			System.out.println(student[i].name+":"+student[i].marks);
		}
		
		for(Student n : student) {//using for-each loop
			System.out.println(n.name+":"+n.marks);
		}
	}

}
