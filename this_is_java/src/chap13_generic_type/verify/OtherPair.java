package chap13_generic_type.verify;

public class OtherPair <N, A>{
	private N name;
	private A age;
	
	public OtherPair(N name, A age) {
		this.name = name;
		this.age = age;
	}

	public N getName() {
		return name;
	}

	public A getAge() {
		return age;
	}
	
}
