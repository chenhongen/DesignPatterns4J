package factory;

/**
 * �ֻ�����������С�ס�ƻ������Ϊ��
 * �̼ҽ���
 * @author che
 *
 */
public class Main {
	public static void main(String[] args) {
		// �޹���ģʽʱ
		// �ɹ�С�ס�ƻ��...����Ҫ�ֱ��޸�Դ��
		System.out.println(new Mi().start());
		System.out.println(new Apple().start());
		
		// �򵥹�����ͨ����װ�����ݲ���ƥ��(�����ɴ������ļ���ȡ��)
		System.out.println(new SimpleFactory().purchase("Mi"));
		
		// ���ڣ��̳У�����
		
		// �����������ڼ򵥹����Ļ����ϣ������ʵ�����������࣬��һ������
		System.out.println(new MiMethodFactory().start());

		// ���󹤳�����Բ�Ʒ��
		System.out.println(new MiAbstactFactory().start());
		System.out.println(new MiAbstactFactory().play());
		
		// �������������ã���������������������ࣩ���߲㲻ֱ�������ײ㣬���߶������ڳ���
		// �����൱�� main --> phone <-- Mi
		System.out.println(new MiAbstactFactory().get().start());
		
	}
}
