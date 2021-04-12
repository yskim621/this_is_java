package chap07.sec06.exam01_protected_package2;

import chap07.sec06.exam01_protected_package1.A;

public class D extends A{
	public D() {
		super();
		this.field = "value";
		this.method();
	}
	
	public void mehtod() {
		this.field = "value";
		this.method();
	}
	
}
