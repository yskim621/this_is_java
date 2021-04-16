package chap13_generic_type.sec04.exam02_generic_method;

public class Util {
	public static <K, V> boolean compare(Pair<K,V> p1,Pair<K,V> p2) {
		boolean keyComepare = p1.getKey().equals(p2.getKey());
		boolean valueComepare = p1.getValue().equals(p2.getValue());
		return keyComepare && valueComepare;
	}
}
