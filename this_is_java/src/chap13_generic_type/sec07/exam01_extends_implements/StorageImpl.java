package chap13_generic_type.sec07.exam01_extends_implements;

public class StorageImpl<T> implements Storage<T>{
	private T[] array;
	
	public StorageImpl(int capacity) {
		array = (T[]) (new Object[capacity]);
	}
	
	@Override
	public void add(T item, int index) {
		array[index] = item;
	}

	@Override
	public T get(int index) {
		return array[index];
	}
	
}
