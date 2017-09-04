package factory;

/**
 * 手机工厂：生产小米、苹果、华为等
 * 商家进货
 * @author che
 *
 */
public class Main {
	public static void main(String[] args) {
		// 无工厂模式时
		// 采购小米、苹果...，需要分别修改源码
		System.out.println(new Mi().start());
		System.out.println(new Apple().start());
		
		// 简单工厂：通过封装，根据参数匹配(参数可从配置文件读取等)
		System.out.println(new SimpleFactory().purchase("Mi"));
		
		// 基于（继承）泛型
		
		// 工厂方法：在简单工厂的基础上，将类的实例化交给子类，进一步解耦
		System.out.println(new MiMethodFactory().start());

		// 抽象工厂：针对产品族
		System.out.println(new MiAbstactFactory().start());
		System.out.println(new MiAbstactFactory().play());
		
		// 插曲：依赖倒置（依赖抽象而不依赖具体类）。高层不直接依赖底层，两者都依赖于抽象
		// 这里相当于 main --> phone <-- Mi
		System.out.println(new MiAbstactFactory().get().start());
		
	}
}
