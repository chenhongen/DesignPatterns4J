package proxy;

/**
 * ��̬����
 * ��Ҫ����ӿڻ��߸���,�����������������һ��ʵ����ͬ�Ľӿڻ����Ǽ̳���ͬ����
 * @author che
 *
 */
public class StaticProxy implements Target {
	
	private Target t; // ��̬����������
	
	public StaticProxy(Target t) {
		super();
		this.t = t;
	}

	public void beforePuchase() {
		System.out.println("��½");
	}
	
	@Override
	public void puchase() {
		beforePuchase();
		t.puchase();
		afterPuchase();
	}
	
	public void afterPuchase() {
		System.out.println("����");
	}
	
}
