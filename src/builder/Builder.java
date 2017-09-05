package builder;

/**
 * ³éÏóÀà
 * @author che
 *
 */
public abstract class Builder {
	abstract void buildCamera(int num);
	abstract void buildScreen(int num);
	abstract void buildCPU(int num);
	
	abstract Phone getProduct();
}
