package factory;

public class MiAbstactFactory extends AbstactFactory {

	@Override
	public String start() {
		return new Mi().start();
	}

	@Override
	public String play() {
		return new MiPad().play();
	}

	// “¿¿µµπ÷√
	public Phone get() {
		return new Mi();
	}

}
