package builder;

public class Main {
	public static void main(String[] args) {
		// 原始
		Phone p = new Phone();
		p.setCAMERA(1);
		p.setCPU(4);
		p.setSCREEN(480);
		System.out.println(p.toString());
		
		// 建造者模式：对一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示
		// 指通过对Builder的不同实现（创建多个类），组装零件成不同产品，这里我只做了一次实现，通过传参构造不同产品
		// builder提供步骤，director负责组装
		System.out.println(new Director(new ConcreteBuilder()).construct(2, 8, 1920).toString());
		
		// 无Director情况，（也可将组装集成到builder）
		System.out.println(new NoDirectorBuilder().buildCamera(1).buildCPU(4).buildScreen(1080).getProduct().toString());
		
		// 实例：mybatis的SqlSessionFactoryBuilder
	}
}