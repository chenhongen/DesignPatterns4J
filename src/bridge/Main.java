package bridge;

/**
 * �Ž�ģʽ�����󲿷�������ʵ�ֲ��ַ��뿪����ʹ���Ƕ����Զ����仯��
 * ��ά�ȶ����仯
 * ���󻯡�ʵ��������ŷ��ǿ����ת��������
 * ��ϣ��ۺϣ��Ǽ̳�
 * @author che
 *
 */
public class Main {
	
	public static void main(String[] args) {
		Company mi = new MiCompany(new MiPhone());
		System.out.println(mi.start());
	}
	
	// MVC:View->Controller->Model Ӧ���Ž�ģʽ����� View->Controller->Service->DAO��by �����ʦ��
}
