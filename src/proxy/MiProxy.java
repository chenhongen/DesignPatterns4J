package proxy;

/**
 * 静态代理类
 * @author Administrator
 *
 */
public class MiProxy implements Target {
	
	private Target t; // 静态体现在这里
	
	public MiProxy(Target t) {
		super();
		this.t = t;
	}

	public void beforePuchase() {
		System.out.println("登陆");
	}
	
	@Override
	public void puchase() {
		beforePuchase();
		t.puchase();
		afterPuchase();
	}
	
	public void afterPuchase() {
		System.out.println("付款");
	}
	
}
