package chap16_Stream.sec06.stream_sorting;

public class Student implements Comparable<Student> {
	private String name;
	private int score;
	
	
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}


	public String getName() {
		return name;
	}


	public int getScore() {
		return score;
	}


	
	@Override
	public int compareTo(Student o) {
		/* 올림차순으로 정렬
		if(score<o.score) return -1;
		else if(score == o.score) return 0;
		else(score>o.score) return 1;
		*/
		return Integer.compare(score, o.score);
	}
	
}
