package chap14_lambda.sec03.exam01_no_argument_no_return;

public class MyFunctionalInterfaceExample {

	public static void main(String[] args) {
		MyFunctionalInterface fi;
		
		fi = () -> {
			String str = "method call1";
			System.out.println(str);
		};
		fi.method();
		
		// 실행문이 1개면 중괄호 생략가능
		fi = () -> System.out.println("method call2");
		fi.method();
		
		fi = new MyFunctionalInterface() {
			public void method() {
				System.out.println("method call3");
			}
		};
		fi.method();
	}

}
