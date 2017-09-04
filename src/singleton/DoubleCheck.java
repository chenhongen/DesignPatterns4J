package singleton;

/**
 * “双重检查锁定”（Double Check Lock（DCL））
 * JDK1.5前可能存在问题
 * @author che
 *
 */
public class DoubleCheck {
	private static DoubleCheck doubleCheck;
	
	private DoubleCheck() {}
	
	public static DoubleCheck getDoubleCheck() {
		if(doubleCheck == null) { // 避免不必要同步
			synchronized(DoubleCheck.class) { // 保证线程安全
				if(doubleCheck == null) {
					doubleCheck = new DoubleCheck();
				}
			}
		}
		return doubleCheck;
	}
}
