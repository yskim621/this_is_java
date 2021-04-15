package chap09_nested_class.sec03.exam03_localclass_access;

public class Outter {
	//자바7 이전
	public void method1(final int arg) {
		final int localVariable = 1;
		class Inner {
			void method() {
				int arg = 10;
				int localVariable = 1;
				int result = arg + localVariable;
			}
		}
	}
	
	//자바8 이후
	public void method2(int arg) {
		int localVariable = 1;
		//arg = 100;
		//localVariable = 15;
		class Inner {
			int arg = 100;
			int localVariable = 15; 
			void method() {
				int result = arg + localVariable;
			}
		}
	}
}
