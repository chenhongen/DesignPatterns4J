package bridge;
/**
 * 抽象类
 * 持有实现类接口
 * @author che
 *
 */
public abstract class Company {
	protected Phone phone;
	
	public Company(Phone phone) {
		super();
		this.phone = phone;
	}

	abstract String start();
}
