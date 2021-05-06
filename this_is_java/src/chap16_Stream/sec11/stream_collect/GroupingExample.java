package chap16_Stream.sec11.stream_collect;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingExample {

	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(
				new Student("홍길동", 10, Student.Sex.MALE, Student.City.Seoul),
				new Student("김수애", 6, Student.Sex.FEMALE, Student.City.Busan),
				new Student("신용권", 10, Student.Sex.MALE, Student.City.Seoul),
				new Student("박수미", 6, Student.Sex.FEMALE, Student.City.Busan)
		);
		
		// 주어진 Key로 객체를 Mapping
		Map<Student.Sex, List<Student>> mapBySex = totalList.stream()
				.collect(Collectors.groupingBy(Student::getSex));
		
		System.out.print("[남학생]");
		mapBySex.get(Student.Sex.MALE).stream()
			.forEach(s -> System.out.print(" " + s.getName()));
		System.out.println();
		
		System.out.print("[여학생]");
		mapBySex.get(Student.Sex.FEMALE).stream()
			.forEach(s -> System.out.print(" " + s.getName()));
		System.out.println();
		
		
		// 요소를 Mapping 후 집계를 하고 명시한 key에 mapping한 값으로 저장
		Map<Student.City, List<String>> mapByCity = totalList.stream()
				.collect(
						Collectors.groupingBy(
						 Student::getCity,
						 Collectors.mapping(Student::getName, Collectors.toList())
						)
				);
		System.out.print("[서울]");
		mapByCity.get(Student.City.Seoul).stream()
			.forEach(name->System.out.print(name + " "));
		System.out.println();
		
		System.out.print("[부산]");
		mapByCity.get(Student.City.Busan).stream()
			.forEach(name->System.out.print(name + " "));
		
	}

}
