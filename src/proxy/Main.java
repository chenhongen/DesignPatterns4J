package proxy;

public class Main {
	public static void main(String[] args) {
		// 静态代理【被代理类、代理类需要实现相同接口】
		new StaticProxy(new Mi()).puchase();
		
		// 动态代理【被代理类需实现接口，代理类不需要】
		((Target) new JDKProxy(new Mi()).getProxyInstance()).puchase();
		
		// cglib代理(创建时间慢但性能高，因此不适用于频繁创建)，需要依赖第三方jar【不需要实现接口】
		// ...
		
		// Spring中的代理
		
	}
}
