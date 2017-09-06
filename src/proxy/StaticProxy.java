package proxy;

/**
 * 静态代理
 * 需要定义接口或者父类,被代理对象与代理对象一起实现相同的接口或者是继承相同父类
 * @author che
 *
 */
public class StaticProxy implements Target {
	
	private Target t; // 静态体现在这里
	
	public StaticProxy(Target t) {
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
