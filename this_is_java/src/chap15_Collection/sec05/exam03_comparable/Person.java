package chap15_Collection.sec05.exam03_comparable;

public class Person implements Comparable<Person> {
	public String name;
	public int age;
	
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	
	
	@Override
	// 메소드의 리턴값이 양수면 2개의 위치 변경, 음수면 유지
	public int compareTo(Person o) {
		if(age<o.age) return -1; // 올림차순 정렬
		else if(age == o.age) return 0;
		else return 1;
	}
	
}
