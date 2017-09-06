package proxy;
/**
 * 被代理类
 * @author che
 *
 */
public class Mi implements Target {

	@Override
	public void puchase() {
		System.out.println("秒杀小米8s");
	}
	
}
