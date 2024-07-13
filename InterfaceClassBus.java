package CoreJava;

interface Vehicle{
	void cleanVehicle();
	
	default void startVehicle() {
		System.out.println("Vehicle is Starting...");
	}
	
	static void washVehicle() {
		System.out.println("Wash the car..");
	}
}
public class InterfaceClassBus implements Vehicle{

	public static void main(String[] args) {

		InterfaceClassBus bus = new InterfaceClassBus();
		bus.cleanVehicle();
		bus.startVehicle();
		Vehicle.washVehicle();
	}

	@Override
	public void cleanVehicle() {

		System.out.println("Cleaning the Vehicle..");
	}

}
