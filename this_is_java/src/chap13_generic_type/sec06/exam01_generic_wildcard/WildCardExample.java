package chap13_generic_type.sec06.exam01_generic_wildcard;

import java.util.Arrays;

public class WildCardExample {
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));

	}
	
	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
	}
	
	public static void registerCourseWorker(Course<? super Student> course) {
		System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));

	}
	
	public static void main(String[] args) {
		Course<Person> personCourse = new Course<>("일반인 과정", 5);
		personCourse.add(new Person("일반인"));
		personCourse.add(new Person("직장인"));
		personCourse.add(new Person("학생"));
		personCourse.add(new Person("고등학생"));
		
		Course<Worker> workerCourse = new Course<>("직장인 과정", 5);
		workerCourse.add(new Worker("직장인"));
		
		Course<Student> studentCourse = new Course<>("학생 과정", 5);
		studentCourse.add(new Student("학생"));
		studentCourse.add(new HighStudent("고등학생"));
		
		Course<HighStudent> highStudent = new Course<>("고등학생 과정", 5);
		highStudent.add(new HighStudent("고등학생"));

		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(highStudent);
		System.out.println();
		
		
		// registerCourseStudent 메소드는 Student의 상위 타입을 제한하므로 Student 클래스를 포함한 그 아래 자식 클래스만 사용가능
		//registerCourseStudent(personCourse);
		// Student와 관계가 없는 클래스이므로 컴파일 에러
		//registerCourseStudent(workerCourse);
		registerCourseStudent(studentCourse);
		registerCourseStudent(highStudent);
		System.out.println();
		
		
		registerCourseWorker(personCourse);
		// Student와 관계가 없는 클래스이므로 컴파일 에러
		//registerCourseWorker(workerCourse);
		registerCourseWorker(studentCourse);
		// registerCourseWorker 메소드는 Student의 하위 타입을 제한하므로 Student 클래스를 포함한 그 아래 부모 클래스만 사용가능
		//registerCourseWorker(highStudent);
		System.out.println();

	}

}
