package adapter;
/**
 * ������ģʽ����һ����Ľӿڱ任�ɿͻ������ڴ�����һ�ֽӿ�
 * Adaptee -> ITarget
 * @author che
 *
 */
public class Main {
	public static void main(String[] args) {
		// �̳�
		ITarget it = new ExtendsAdapter();
		System.out.println(it.newMethod());
		
		// ���
		ITarget it1 = new CompositeAdapter();
		System.out.println(it1.newMethod());
	}
}
