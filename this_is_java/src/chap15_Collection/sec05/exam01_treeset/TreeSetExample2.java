package chap15_Collection.sec05.exam01_treeset;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample2 {

	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<Integer>();
		scores.add(87);
		scores.add(new Integer(98));
		scores.add(new Integer(75));
		scores.add(new Integer(95));
		scores.add(new Integer(80));
		
		// descendingSet 메소드는 내림차순 정렬
		NavigableSet<Integer> descendingSet = scores.descendingSet();
		for(Integer score : descendingSet) {
			System.out.print(score + " ");
		}
		System.out.println();
		
		// descendingSet.descendingSet()은 내림차순을 거꾸로 뒤집는 것이므로 오름차순 정렬
		NavigableSet<Integer> asendingSet = descendingSet.descendingSet();
		for(Integer score : asendingSet) {
			System.out.print(score + " ");
		}
		System.out.println();
	}

}
