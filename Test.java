package Oops;

class Parent{
	void m1() {
		System.out.println("Parent class:: m1 Constructor called");
	}
}

class Child extends Parent{
	
	void m1() {
		System.out.println("Child class:: m1 Constructor called");
	}
	
	void m2() {
		System.out.println("Child class:: m2 Constructor called");
	}
	 public int hashcode() {
		 return 101;
	 }
}
public class Test {

	public static void main(String[] args) {

		Child c = new Child();
		c.m1();
		c.m2();
		int hashcode = c.hashcode();
		System.out.println("hashcode :: "+ hashcode);
	}

}
