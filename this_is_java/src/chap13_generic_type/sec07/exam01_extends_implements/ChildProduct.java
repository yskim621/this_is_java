package chap13_generic_type.sec07.exam01_extends_implements;

public class ChildProduct<K, V, C> extends Product<K, V> {
	private C company;

	public C getCompany() {
		return company;
	}

	public void setCompany(C company) {
		this.company = company;
	}
	
	
}
