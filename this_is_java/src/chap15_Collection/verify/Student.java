package chap15_Collection.verify;

public class Student {
	public int studentNum;
	public String name;
	
	
	public Student(int studentNum, String name) {
		super();
		this.studentNum = studentNum;
		this.name = name;
	}
	
	public Student() {

	}

	@Override
	public int hashCode() {
		return studentNum;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Student) {
			Student student = (Student) obj;
			if(studentNum == student.studentNum) return true;
		}
		return false;
	}
}
