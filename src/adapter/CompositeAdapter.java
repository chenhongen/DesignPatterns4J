package adapter;

public class CompositeAdapter implements ITarget {
	private Adaptee a = new Adaptee();
	
	public String newMethod() {
		return a.oldMethod();
	}
}
