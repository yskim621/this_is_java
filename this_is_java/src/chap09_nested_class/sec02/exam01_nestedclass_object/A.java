package chap09_nested_class.sec02.exam01_nestedclass_object;

public class A {
	A(){
		System.out.println("A객체가 생성됨");
	}
	
	class B {
		int field1;
		//static int field2;
		B(){
			System.out.println("B객체가 생성됨");
		}
		void method1() {}
		//static void method2() {}
	}
	
	static class C {
		int field1;
		static int field2;
		C(){
			System.out.println("C객체가 생성됨");
		}
		void method1() {}
		static void method2() {}
	}
	
	void method() {
		class D {
			int field1;
			//static int field2;
			D(){
				System.out.println("D객체가 생성됨");
			}
			void method1() {}
			//static void method2() {}
		}
		
		D d = new D();
		d.field1 = 4;
		d.method1();
		
	}
}
