package proxy;

public class Main {
	public static void main(String[] args) {
		// ��̬����
		//new StaticProxy(new Mi()).puchase();
		// ��̬����
		new JDKProxy(new Mi()).getProxyInstance();
	}
}
