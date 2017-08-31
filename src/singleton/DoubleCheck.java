package singleton;

/**
 * 1.5ǰ���ܴ�������
 * @author che
 *
 */
public class DoubleCheck {
	private static DoubleCheck doubleCheck;
	
	private DoubleCheck() {}
	
	public static DoubleCheck getDoubleCheck() {
		if(doubleCheck == null) {
			synchronized(DoubleCheck.class) { // !
				if(doubleCheck == null) {
					doubleCheck = new DoubleCheck();
				}
			}
		}
		return doubleCheck;
	}
}
