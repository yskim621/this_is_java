package chap14_lambda.sec05.exam07_andthen_compose;

import java.util.function.Consumer;

public class ConsumerAndthenExample {

	public static void main(String[] args) {
		Consumer<Member> consumerA = m -> {
			System.out.println("consumerA: " + m.getName());
		};
		
		Consumer<Member> consumerB = m -> {
			System.out.println("consumerB: " + m.getId());
		};
		
		// andThen은 consumerA부터 실행하고 그 리턴값을 consumerB에 매개값으로 제공하여 실행
		// Consumer Class는 compose 메소드를 default method로 제공하지 않음
		Consumer<Member> consumerAB = consumerA.andThen(consumerB);
		consumerAB.accept(new Member("홍길동", "hong", null));
	}

}
