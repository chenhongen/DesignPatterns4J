package singleton;

/**
 * ��˫�ؼ����������Double Check Lock��DCL����
 * JDK1.5ǰ���ܴ�������
 * @author che
 *
 */
public class DoubleCheck {
	private static DoubleCheck doubleCheck;
	
	private DoubleCheck() {}
	
	public static DoubleCheck getDoubleCheck() {
		if(doubleCheck == null) { // ���ⲻ��Ҫͬ��
			synchronized(DoubleCheck.class) { // ��֤�̰߳�ȫ
				if(doubleCheck == null) {
					doubleCheck = new DoubleCheck();
				}
			}
		}
		return doubleCheck;
	}
}
