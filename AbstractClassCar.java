package CoreJava;

abstract class Vehical{
	 public abstract void draw();
}
public class AbstractClassCar extends Vehical {

	public static void main(String[] args) {

		AbstractClassCar car = new AbstractClassCar();
		car.draw();
		
	}

	@Override
	public void draw() {

		System.out.println("Car Drawing...");
	}

}
