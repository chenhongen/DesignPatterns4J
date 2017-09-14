package mediator;

public class Main {
	public static void main(String[] args) {
		// ãã�˺��д������
		//new BoyDog().blindDate("�߾�"); // ʧ��
		//new BoyDog().blindDate("����"); // ʧ��
		new BoyDog().blindDate(new BoyDog()); // ʧ��
		new BoyDog().blindDate(new GirlDog()); // �ɹ�
		
		// �н���
		Mediator cm = new ConcreteMediator();
		BoyDog boy = new BoyDog(cm);
		boy.mediator.addDog2List(boy);
		GirlDog girl = new GirlDog(cm);
		girl.mediator.addDog2List(girl);
		System.out.println(cm.pair(boy.gender).gender);
	}
}
