package CoreJava;

class Parent{
	int maxSpeed = 10;
}

public class SuperCallToVariable extends Parent {

	int maxSpeed = 20;
	
	void display() {
		System.out.println("Max Speed: " + super.maxSpeed);
	}
	
	public static void main(String[] args) {

		SuperCallToVariable s = new SuperCallToVariable();
		s.display();
	}

}
