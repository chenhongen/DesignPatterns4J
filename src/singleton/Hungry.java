package singleton;
/**
 * 单例 - 懒汉
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
