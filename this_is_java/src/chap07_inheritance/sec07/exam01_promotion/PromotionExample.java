package chap07_inheritance.sec07.exam01_promotion;

public class PromotionExample {
	
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b;
		A a2 = c;
	}
}
