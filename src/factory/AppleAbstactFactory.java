package factory;

public class AppleAbstactFactory extends AbstactFactory {

	@Override
	public String start() {
		return new Apple().start();
	}

	@Override
	public String play() {
		return new ApplePad().play();
	}

}
