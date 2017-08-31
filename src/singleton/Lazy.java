package singleton;

public class Lazy {
	private static Lazy lazy;
	
	private Lazy() {}
	
	// 每次调用都会触发同步，而实际上仅在第一次new的时候需要
	public static synchronized Lazy getLazy() {
		// 此处存在线程安全问题，需加锁
		if(lazy == null) {
			lazy = new Lazy();
		}
		return lazy;
	}
}
