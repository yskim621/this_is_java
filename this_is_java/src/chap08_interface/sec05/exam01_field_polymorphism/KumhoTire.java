package chap08_interface.sec05.exam01_field_polymorphism;

public class KumhoTire implements Tire {

	@Override
	public void roll() {
		System.out.println("금호 타이어가 굴러갑니다.");
	}
	
}
