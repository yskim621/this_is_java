package chap13_generic_type.sec07.exam01_extends_implements;

public interface Storage <T>{
	public void add(T item, int index);
	public T get(int index);
}
