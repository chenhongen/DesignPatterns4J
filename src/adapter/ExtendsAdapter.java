package adapter;
/**
 * 
 * @author che
 *
 */
//public class Adapter extends ETarget {
public class ExtendsAdapter extends Adaptee implements ITarget {
	public String newMethod() {
		return super.oldMethod();
	}
}
