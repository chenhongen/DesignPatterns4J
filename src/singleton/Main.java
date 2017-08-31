package singleton;

public class Main {
	public static void main(String[] args) {
		Hungry h1 = Hungry.getHungry();
		
		Hungry h2 = Hungry.getHungry();
		System.out.println(h2.equals(h1));
		
		// 默认构造函数情况下，可通过new创建新的实例；私有化构造函数可避免。
		//Hungry h3 = new Hungry();
		//System.out.println(h3.equals(h1));
	}
}
