package composite;

public class Main {
	// ���ģʽ��ʹ�û��޲��������ӽṹ����
	public Main() {
		Leaf leaf1 = new Leaf("�ӽڵ�1");
		Leaf leaf2 = new Leaf("�ӽڵ�2");
		
		Composite parent = new Composite("���ڵ�");
		parent.add(leaf1);
		parent.add(leaf2);
		
		parent.operate();
		
	}
}
