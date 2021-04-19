package chap13_generic_type.verify;

public class Util {
	// how1
	/*
	 * public static < N, A > A getValue(Pair<N, A> p, N name) { if(p.getName() ==
	 * name) { return p.getAge(); } else { return null; }
	 * 
	 * }
	 */
	
	// how2
	public static < P extends Pair<N, A>, N, A > A getValue(P p, N name) { 
		if(p.getName() ==name) { return p.getAge(); } 
		else { return null; }
			 
	}
}
