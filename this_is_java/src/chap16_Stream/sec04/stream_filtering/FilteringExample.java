package chap16_Stream.sec04.stream_filtering;

import java.util.Arrays;
import java.util.List;

public class FilteringExample {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("홍길동", "신용권", "감자바", "신용권", "신민철");
		
		// distinct() 메소드를 이용한 중복 제거
		names.stream()
			.distinct()
			.forEach(n->System.out.println(n));
		System.out.println();
		
		
		// filter() 메소드를 이용하여 predicate에 true인 값만 리턴
		names.stream()
			.filter(n->n.startsWith("신"))
			.forEach(n->System.out.println(n));
		System.out.println();
		
		
		// distinct()로 중복을 제거 후, filter()를 이용한 조건값 추출
		names.stream()
			.distinct()
			.filter(n->n.startsWith("신"))
			.forEach(n->System.out.println(n));
	}

}
