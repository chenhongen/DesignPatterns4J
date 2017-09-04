package factory;

public class AppleMethodFactory extends MethodFactory {

	@Override
	public String start() {
		return new Apple().start();
	}

}
