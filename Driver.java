package com.practice;

class Doctor{
	
	int doctorage;
	String doctorname;

	
}
class Driver {
	
	void print(Doctor d) {
		 System.out.println(d.doctorage+" "+ d.doctorname);
	 }

	public static void main(String[] args) {

		Driver d1 = new Driver();
		
		Doctor d = new Doctor();
		d.doctorage = 23;
		d.doctorname = "Dr.Jadhav";
		
		d1.print(d);
	
	}
}
