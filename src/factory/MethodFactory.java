package factory;

abstract class MethodFactory {
	// 可定义共有属性、方法
	public abstract String start();
	
	public String fly() {
		return "飞行模式中~";
	}
}
