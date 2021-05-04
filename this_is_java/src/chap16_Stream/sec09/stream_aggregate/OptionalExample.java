package chap16_Stream.sec09.stream_aggregate;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExample {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		/* NoSuchElementException
		double avg = list.stream()
				.mapToInt(Integer :: intValue)
				.average()
				.getAsDouble();*/
		
		OptionalDouble optional = list.stream()
			.mapToInt(Integer :: intValue)
			.average();
		if(optional.isPresent()) {
			System.out.println("방법1_평균: " + optional.getAsDouble());
		} else {
			System.out.println("방법1_평균: 0.0");
		}
		
		double avg = list.stream()
				.mapToInt(Integer :: intValue)
				.average()
				.orElse(0.0); // 값이 없으면 default값 제공
		System.out.println("방법2_평균: " + avg);
		
		
		list.add(2);
		list.add(4);
		
		list.stream()
			.mapToInt(Integer :: intValue)
			.average()
			.ifPresent(a -> System.out.println("방법3_평균: " + a)); // 값이 있으면 실행문 실행
		
		
	}

}
