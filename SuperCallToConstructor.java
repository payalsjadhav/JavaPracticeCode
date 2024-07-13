package CoreJava;

class Student{
	
	Student(){
		System.out.println("Parent class Constructor.");
	}
}
public class SuperCallToConstructor extends Student {
	
	SuperCallToConstructor(){
		super();
		System.out.println("Child class Constructor.");
	}

	public static void main(String[] args) {

		SuperCallToConstructor s = new SuperCallToConstructor();
		
	}

}
