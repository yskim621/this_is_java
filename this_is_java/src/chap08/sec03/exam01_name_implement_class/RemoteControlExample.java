package chap08.sec03.exam01_name_implement_class;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Television();
		rc = new Audio();
		
		rc.turnOn();
		rc.turnOff();
	}

}
