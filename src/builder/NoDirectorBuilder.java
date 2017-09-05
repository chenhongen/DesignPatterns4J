package builder;

/**
 * 具体实现类
 * @author che
 *
 */
public class NoDirectorBuilder {
	Phone p = new Phone();
	
	public NoDirectorBuilder buildCamera(int num) {
		p.setCAMERA(num);
		return this;
	}

	public NoDirectorBuilder buildScreen(int num) {
		p.setSCREEN(num);
		return this;
	}

	public NoDirectorBuilder buildCPU(int num) {
		p.setCPU(num);
		return this;
	}

	public Phone getProduct() {
		return p;
	}
	
	
}
