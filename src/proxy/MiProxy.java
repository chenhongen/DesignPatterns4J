package proxy;

/**
 * ��̬������
 * @author Administrator
 *
 */
public class MiProxy implements Target {
	
	private Target t; // ��̬����������
	
	public MiProxy(Target t) {
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
