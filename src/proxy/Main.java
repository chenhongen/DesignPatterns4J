package proxy;

public class Main {
	public static void main(String[] args) {
		// ��̬�����������ࡢ��������Ҫʵ����ͬ�ӿڡ�
		new StaticProxy(new Mi()).puchase();
		
		// ��̬��������������ʵ�ֽӿڣ������಻��Ҫ��
		((Target) new JDKProxy(new Mi()).getProxyInstance()).puchase();
		
		// cglib����(����ʱ���������ܸߣ���˲�������Ƶ������)����Ҫ����������jar������Ҫʵ�ֽӿڡ�
		// ...
		
		// Spring�еĴ���
		
	}
}
