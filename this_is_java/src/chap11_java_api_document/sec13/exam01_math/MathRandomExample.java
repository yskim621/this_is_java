package chap11_java_api_document.sec13.exam01_math;

public class MathRandomExample {

	public static void main(String[] args) {
		int num = (int) (Math.random()*6) + 1;
		System.out.println("주사위 눈: " + num);
	}

}
