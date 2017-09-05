package builder;

public class Main {
	public static void main(String[] args) {
		// ԭʼ
		Phone p = new Phone();
		p.setCAMERA(1);
		p.setCPU(4);
		p.setSCREEN(480);
		System.out.println(p.toString());
		
		// ������ģʽ����һ�����Ӷ���Ĺ��������ı�ʾ���룬ʹ��ͬ���Ĺ������̿��Դ�����ͬ�ı�ʾ
		// ָͨ����Builder�Ĳ�ͬʵ�֣���������ࣩ����װ����ɲ�ͬ��Ʒ��������ֻ����һ��ʵ�֣�ͨ�����ι��첻ͬ��Ʒ
		// builder�ṩ���裬director������װ
		System.out.println(new Director(new ConcreteBuilder()).construct(2, 8, 1920).toString());
		
		// ��Director�������Ҳ�ɽ���װ���ɵ�builder��
		System.out.println(new NoDirectorBuilder().buildCamera(1).buildCPU(4).buildScreen(1080).getProduct().toString());
		
		// ʵ����mybatis��SqlSessionFactoryBuilder
	}
}