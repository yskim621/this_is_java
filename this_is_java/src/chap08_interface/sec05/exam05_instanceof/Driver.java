package chap08_interface.sec05.exam05_instanceof;

public class Driver {
	public void drive(Vehicle vehicle) {
		vehicle.run();
		if(vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		}
	} 
}
