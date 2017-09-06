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

	public String beforePuchase() {
		return "登陆";
	}
	
	@Override
	public String puchase() {
		return beforePuchase() + "-" + t.puchase() + "-" + afterPuchase();
	}
	
	public String afterPuchase() {
		return "付款";
	}
	
}
