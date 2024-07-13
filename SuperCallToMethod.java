package CoreJava;

class BaseClass{
	void show() {
		System.out.println("Base class Method will Called.");
	}
}
public class SuperCallToMethod extends BaseClass{
	
	void show() {
		System.out.println("Child Class Method Will Called.");
	}
	
	void display() {
		show();
		
		super.show();
	}

	public static void main(String[] args) {

		SuperCallToMethod s = new SuperCallToMethod();
		s.display();
	}

}
