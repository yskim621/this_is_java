package chap06.sec15.ex01_annotation;

import java.lang.reflect.Method;

public class PrintAnnotationExample {

	public static void main(String[] args) {
		Method[] declaredMethods = Service.class.getDeclaredMethods();
		
		for(Method method : declaredMethods) {
			//ystem.out.println(method.getName());
			if(method.isAnnotationPresent(PrintAnnotation.class)) {
				PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
				
				// 메소드 이름 출력
				System.out.println("[" + method.getName() + "]" );
				
				// 구분선 출력
				for(int i=0; i<printAnnotation.number(); i=i+1) {
					System.out.print(printAnnotation.value());	
				}
				System.out.println();
				
				// 메소드 호출
				try {
					method.invoke(new Service());
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println();
			}
		}
	}

}
