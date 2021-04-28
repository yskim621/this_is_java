package chap15_Collection.sec05.exam01_treeset;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample3 {

	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("apple");
		treeSet.add("forever");
		treeSet.add("description");
		treeSet.add("ever");
		treeSet.add("zoo");
		treeSet.add("base");
		treeSet.add("guess");
		treeSet.add("cherry");
		
		System.out.println("[c~f사이의 단어 검색]");
		// subset메소드는 두 단어(글자) 사이의 단어(문자)들 발췌
		// 4개 인자의 경우 - 2번쨰 인자는 첫번째 글자를 포함할 것인지 / 4번째 인자는 세번째 글자를 포함할 것인지 여부
		NavigableSet<String> rangeSet = treeSet.subSet("c", true, "f", true);
		for(String word : rangeSet) {
			System.out.println(word);
		}
	}

}
