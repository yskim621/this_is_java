package chap14_lambda.sec05.exam08_and_or_negate_isequal;

import java.util.function.IntPredicate;

public class PredicateAndOrNegateExample {

	public static void main(String[] args) {
		// 2의 배수를 검사
		IntPredicate predicateA = a -> a%2 == 0;
		
		// 3의 배수를 검사
		IntPredicate predicateB = a -> a%3 == 0;
		
		IntPredicate predicateAB;
		boolean result;
		
		// and() - &&와 대응되며 인터페이스 중 하나라도 false라면 false
		predicateAB = predicateA.and(predicateB);
		result = predicateAB.test(9);
		System.out.println("9는 2와 3의 배수입니까? " + result);
		
		// or() - ||와 대응되며 인터페이스 중 하나라도 true라면 true
		predicateAB = predicateA.or(predicateB);
		result = predicateAB.test(9);
		System.out.println("9는 2와 3의 배수입니까? " + result);
		
		// negate() - !와 대응되므로 결과가 true면 리턴값은 false, false면 리턴값은 true;
		predicateAB = predicateA.negate();
		predicateAB = predicateA.or(predicateB);
		result = predicateAB.test(9);
		System.out.println("9는 홀수입니까? " + result);
	}

}
