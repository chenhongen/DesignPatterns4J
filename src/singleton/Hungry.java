package singleton;
/**
 * 饿汉懒汉
 * 在系统运行起来装载类的时候就进行初始化实例的操作，由 JVM 虚拟机来保证一个类的初始化方法在多线程环境中被正确加锁和同步，所以是线程安全的
 * @author che
 *
 */
public class Hungry {
	private static Hungry hungry = new Hungry(); // final?
	
	// 私有化
	private Hungry() {
		
	}
	
	// 开放外界调用唯一入口
	public static Hungry getHungry() {
		return hungry;
	}
}
