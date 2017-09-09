package bridge;

/**
 * 桥接模式：抽象部分与它的实现部分分离开来，使他们都可以独立变化。
 * 多维度独立变化
 * 抽象化、实例化、脱欧（强关联转弱关联）
 * 组合（聚合）非继承
 * @author che
 *
 */
public class Main {
	
	public static void main(String[] args) {
		Company mi = new MiCompany(new MiPhone());
		System.out.println(mi.start());
	}
	
	// MVC:View->Controller->Model 应用桥接模式，拆成 View->Controller->Service->DAO（by 李刚老师）
}
