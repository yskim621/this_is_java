package chap13_generic_type.verify;

public class ChildPair<N, A> extends Pair<N, A> {
	private N name;
	private A age;
	
	public ChildPair(N name, A age) {
		super(name, age);
	}
	
	
	
}
