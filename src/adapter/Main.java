package adapter;
/**
 * 适配器模式：把一个类的接口变换成客户端所期待的另一种接口
 * Adaptee -> ITarget
 * @author che
 *
 */
public class Main {
	public static void main(String[] args) {
		// 继承
		ITarget it = new ExtendsAdapter();
		System.out.println(it.newMethod());
		
		// 组合
		ITarget it1 = new CompositeAdapter();
		System.out.println(it1.newMethod());
	}
}
