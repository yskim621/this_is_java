package chap14_lambda.sec04.exam01_field;

public class UsingThis {
	public int outterField = 10;
	
	class Inner { 
		int innerField = 20;
		
		void method() {
			MyFunctionalInterface fi = () -> {
				System.out.println("outterField: " + outterField);
				// Nested Class 내부에서 외부의 클래스 field에 접근하기 위해서 명시적으로 ClassName.this를 추가 
				System.out.println("outterField: " + UsingThis.this.outterField);
				System.out.println("innerField: " + innerField);
				// 여기서 this는 Inner Class를 지시함
				System.out.println("innerField: " + this.innerField);
			};
			fi.method();
		}
	}
}
