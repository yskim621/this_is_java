package chap14_lambda.sec05.exam05_operator;

import java.util.function.IntBinaryOperator;

public class OperatorExample {
	private static int[] scores = { 92, 95, 89};
	
	// main 메소드에 있는 maxOrMin 호출 시 매개값으로 람다식을 대입 - 즉, applyAsInt는 람다식의 연산 과정을 거쳐 max 도출
	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		for(int score : scores) {
			result = operator.applyAsInt(result, score);
		}
		return result;
	}
	
	public static void main(String[] args) {
		// 최대값 얻기
		int max = maxOrMin(
				(a, b) -> {
					if(a>=b) return a;
					else return b;
				}
		);
		System.out.println("최대값: " + max);
		
		// 최소값 얻기
		int min = maxOrMin(
				(a, b) -> {
					if(a<=b) return a;
					else return b;
				}
		);
		System.out.println("최대값: " + min);
	}

}
