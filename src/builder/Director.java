package builder;

/**
 * 产品组装类
 * @author che
 *
 */
public class Director {
    Builder builder;
    public Director(Builder builder) {
        this.builder = builder;
    }
    public Phone construct(int camera, int cpu, int screen) {
        builder.buildCamera(camera);
        builder.buildCPU(cpu);
        builder.buildScreen(screen);
        
        return builder.getProduct();
    }
}
