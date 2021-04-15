package chap07_inheritance.sec06.exam01_protected_package2;

import chap07_inheritance.sec06.exam01_protected_package1.A;

public class C {
	public void method() {
		/* 에러
		A a = new A();
		a.field = "value";
		a.method();
		*/
	}
}
