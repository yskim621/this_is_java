package chap13_generic_type.verify;

public class Pair<N, A> {
	private N name;
	private A age;
	
	public Pair(N name, A age) {
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
