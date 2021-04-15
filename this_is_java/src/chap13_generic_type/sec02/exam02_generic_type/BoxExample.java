package chap13_generic_type.sec02.exam02_generic_type;


public class BoxExample {

	public static void main(String[] args) {
		// 생성자를 만들 때 Generic으로 타입을 선언했으므로 선언한 타입만 대입가능
		Box<String> box1 = new Box<String>();
		box1.set("hello");
		String greet = box1.get();
	
		
		Box<Integer> box2 = new Box<Integer>();
		box2.set(6);
		int vale = box2.get();
	}

}
