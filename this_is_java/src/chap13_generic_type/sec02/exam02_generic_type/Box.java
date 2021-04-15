package chap13_generic_type.sec02.exam02_generic_type;

public class Box<T> {
	private T t;
	
	public void set(T t) {
		this.t = t;
	}
	
	public T get() {
		return t;
	}
}
