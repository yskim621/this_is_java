package chap14_lambda.sec04.exam02_local_variable;

public class UsingLocalVariable {
	void method(int arg) { //매개변수 arg는 final 특성을 가짐
		int localVar = 40; // 지역변수 localVar는 final 특성을 가짐 Java에서는 별도로 암시적으로 컴파일러가 final를 추가해서 해석
		
		// final 특성을 가지므로 수정 불가
		// arg = 31; 
		// localVar= 41;
		
		MyFunctionalInterface fi = () -> {
			System.out.println("arg: " + arg);
			System.out.println("localVar: " + localVar);
		};
		fi.method();
	}
}
