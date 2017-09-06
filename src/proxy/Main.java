package proxy;

public class Main {
	public static void main(String[] args) {
		// 静态代理
		//new StaticProxy(new Mi()).puchase();
		// 动态代理
		new JDKProxy(new Mi()).getProxyInstance();
	}
}
