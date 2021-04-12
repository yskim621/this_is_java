package chap08.sec04.exam01_abstract_method;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc;
		
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
	}

}
