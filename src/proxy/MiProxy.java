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

	public String beforePuchase() {
		return "��½";
	}
	
	@Override
	public String puchase() {
		return beforePuchase() + "-" + t.puchase() + "-" + afterPuchase();
	}
	
	public String afterPuchase() {
		return "����";
	}
	
}
