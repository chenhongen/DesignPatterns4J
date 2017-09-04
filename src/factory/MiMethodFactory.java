package factory;

public class MiMethodFactory extends MethodFactory {

	@Override
	public String start() {
		return new Mi().start();
	}

}
