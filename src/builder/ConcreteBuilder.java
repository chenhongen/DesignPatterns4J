package builder;

/**
 * 具体实现类
 * @author che
 *
 */
public class ConcreteBuilder extends Builder {
	Phone p = new Phone();
	
	@Override
	void buildCamera(int num) {
		p.setCAMERA(num);
	}

	@Override
	void buildScreen(int num) {
		p.setSCREEN(num);
	}

	@Override
	void buildCPU(int num) {
		p.setCPU(num);
	}

	@Override
	Phone getProduct() {
		return p;
	}

}
