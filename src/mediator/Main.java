package mediator;

public class Main {
	public static void main(String[] args) {
		// 茫茫人海中处对象简化
		//new BoyDog().blindDate("蛇精"); // 失败
		//new BoyDog().blindDate("恐龙"); // 失败
		new BoyDog().blindDate(new BoyDog()); // 失败
		new BoyDog().blindDate(new GirlDog()); // 成功
		
		// 中介者
		Mediator cm = new ConcreteMediator();
		BoyDog boy = new BoyDog(cm);
		boy.mediator.addDog2List(boy);
		GirlDog girl = new GirlDog(cm);
		girl.mediator.addDog2List(girl);
		System.out.println(cm.pair(boy.gender).gender);
	}
}
