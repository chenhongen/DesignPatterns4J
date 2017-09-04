package singleton;

public class Main {
	/**
	 * 单例模式确保此类仅有一个实例，自行实例化并提供一个访问它的全局公有静态方法
	 * 考虑以下因素：
	 * 线程安全
	 * 防止反序列化
	 * 反射
	 * 克隆
	 * 多个类加载器、分布式系统
	 * JDK版本
	 */
	public static void main(String[] args) {
		Hungry h1 = Hungry.getHungry();
		Hungry h2 = Hungry.getHungry();
		System.out.println(h2.equals(h1));
		
		// 默认构造函数情况下，可通过new创建新的实例；私有化构造函数可避免。
		//Hungry h3 = new Hungry();
		//System.out.println(h3.equals(h1));
		
		Lazy l1 = Lazy.getLazy();
		Lazy l2 = Lazy.getLazy();
		System.out.println(l1.equals(l2));
		
		DoubleCheck d1 = DoubleCheck.getDoubleCheck();
		DoubleCheck d2 = DoubleCheck.getDoubleCheck();
		System.out.println(d1.equals(d2));
		
		
		
	}
}
