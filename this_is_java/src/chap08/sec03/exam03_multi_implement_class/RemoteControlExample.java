package chap08.sec03.exam03_multi_implement_class;

public class RemoteControlExample {

	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();
		
		RemoteControl rc = (RemoteControl) tv;
		
	}

}
