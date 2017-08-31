package singleton;

public class Lazy {
	private static Lazy lazy;
	
	private Lazy() {}
	
	// ÿ�ε��ö��ᴥ��ͬ������ʵ���Ͻ��ڵ�һ��new��ʱ����Ҫ
	public static synchronized Lazy getLazy() {
		// �˴������̰߳�ȫ���⣬�����
		if(lazy == null) {
			lazy = new Lazy();
		}
		return lazy;
	}
}
