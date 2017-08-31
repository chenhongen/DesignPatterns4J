package singleton;
/**
 * ���� - ����
 * @author che
 *
 */
public class Hungry {
	private static Hungry hungry = new Hungry(); // final?
	
	// ˽�л�
	private Hungry() {
		
	}
	
	// ����������Ψһ���
	public static Hungry getHungry() {
		return hungry;
	}
}
