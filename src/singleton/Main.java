package singleton;

public class Main {
	/**
	 * ����ģʽȷ���������һ��ʵ��������ʵ�������ṩһ����������ȫ�ֹ��о�̬����
	 * �����������أ�
	 * �̰߳�ȫ
	 * ��ֹ�����л�
	 * ����
	 * ��¡
	 * �������������ֲ�ʽϵͳ
	 * JDK�汾
	 */
	public static void main(String[] args) {
		Hungry h1 = Hungry.getHungry();
		Hungry h2 = Hungry.getHungry();
		System.out.println(h2.equals(h1));
		
		// Ĭ�Ϲ��캯������£���ͨ��new�����µ�ʵ����˽�л����캯���ɱ��⡣
		//Hungry h3 = new Hungry();
		//System.out.println(h3.equals(h1));
		
		Lazy l1 = Lazy.getLazy();
		Lazy l2 = Lazy.getLazy();
		System.out.println(l1.equals(l2));
		
		DoubleCheck d1 = DoubleCheck.getDoubleCheck();
		DoubleCheck d2 = DoubleCheck.getDoubleCheck();
		System.out.println(d1.equals(d2));
		
		
		
	}
}
