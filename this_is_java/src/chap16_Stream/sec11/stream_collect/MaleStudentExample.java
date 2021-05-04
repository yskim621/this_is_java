package chap16_Stream.sec11.stream_collect;

import java.util.Arrays;
import java.util.List;

public class MaleStudentExample {

	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(
				new Student("홍길동", 10, Student.Sex.MALE),
				new Student("김수애", 6, Student.Sex.FEMALE),
				new Student("신용권", 10, Student.Sex.MALE),
				new Student("박수미", 6, Student.Sex.FEMALE)
		);
		
		totalList.stream()
			.filter(s -> s.getSex() == Student.Sex.MALE)
			.collect(
					() -> new MaleStudent(),
					(r,t) -> r.accumulate(t),
					(r1,r2) -> r1.combine(r2));
	}

}
