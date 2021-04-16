package chap13_generic_type.sec05.exam01_bounded_type;

public class BoundedTypeParameterExample {

	public static void main(String[] args) {
		//int result1 = Util.compare("a", "b"); => String은 Number의 자식 클래스가 아니므로 비교 불가
		
		int result1 = Util.compare(10, 20);
		System.out.println(result1);
		
		int result2 = Util.compare(4.5, 3);
		System.out.println(result2);
	}

}
