package singleton;
/**
 * ��������
 * ��ϵͳ��������װ�����ʱ��ͽ��г�ʼ��ʵ���Ĳ������� JVM ���������֤һ����ĳ�ʼ�������ڶ��̻߳����б���ȷ������ͬ�����������̰߳�ȫ��
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
