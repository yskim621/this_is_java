package chap08.sec05.exam05_instanceof;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);
		System.out.println("-------------------------------------------");
		driver.drive(taxi);
	}

}
