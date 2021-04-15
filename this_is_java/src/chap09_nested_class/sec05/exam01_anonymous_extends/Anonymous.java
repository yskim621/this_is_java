package chap09_nested_class.sec05.exam01_anonymous_extends;

public class Anonymous {
	Person field = new Person() {
		String studentNo;
		void work() {
			System.out.println("출근합니다.");
		}
		
		@Override
		void wake() {
			System.out.println("6시에 일어납니다.");
			work();
		};
	};
	
	void method1() {
		Person localVar = new Person() {
			String studentNo;
			void walk() {
				System.out.println("산책합니다.");
			}
			
			@Override
			void wake() {
				System.out.println("8시에 일어납니다.");
				walk();
			};
		};
		localVar.wake();
	}
	
	void method2(Person person) {
		person.wake();
	}
}
