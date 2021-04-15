package chap10_exception.sec03_try_catch_finally;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.lang.String");
			System.out.println("클래스를 찾았습니다.");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
			e.printStackTrace();
		} finally {
			System.out.println("프로그램을 안전하게 종료합니다.");
		}
	}

}
