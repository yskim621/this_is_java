package chap15_Collection.sec04.exam01_hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample2 {

	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		
		map.put(new Student(1, "홍길동"), 95);
		map.put(new Student(1, "홍길동"), 90);
	
		System.out.println("총 Entry 수: " + map.size());
		
		System.out.println(map.get(new Student(1, "홍길동")));
	}

}
