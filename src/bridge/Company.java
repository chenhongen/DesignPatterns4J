package bridge;
/**
 * ������
 * ����ʵ����ӿ�
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
