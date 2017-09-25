package composite;

/**
 * 用户直接操作对象
 * @author che
 *
 */
public abstract class Component {
	public String name;  
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public abstract void operate();
}
