package chap15_Collection.sec05.exam01_treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample1 {

	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<Integer>();
		scores.add(87);
		scores.add(new Integer(98));
		scores.add(new Integer(75));
		scores.add(new Integer(95));
		scores.add(new Integer(80));
		
		Integer score = null;
		
		score = scores.first();
		System.out.println("가장 낮은 점수: " + score);
	
		score = scores.last();
		System.out.println("가장 높은 점수: " + score);
		
		score = scores.lower(95);
		System.out.println("95점 아래 점수: " + score);
		
		score = scores.higher(95);
		System.out.println("95점 위의 점수: " + score);
		
		score = scores.floor(new Integer(95));
		System.out.println("95점이거나 바로 아래 점수: " + score);
		
		score = scores.ceiling(new Integer(85));
		System.out.println("85점이거나 바로 아래 점수: " + score);
		
		
		while(!scores.isEmpty()) {
			score = scores.pollLast();
			System.out.println(score + "(남은 객체 수: " + scores.size() + ")");
		}
		
		/*
		Iterator <Integer> iterator = scores.iterator();
		while(iterator.hasNext()) {
			int s = iterator.next();
			//iterator.remove();
			System.out.print(s + "\t");
			//System.out.println(score + "(남은 객체 수: " + scores.size() + ")");
		}
		System.out.println();
		*/
	}

}
