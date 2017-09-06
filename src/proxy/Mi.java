package proxy;
/**
 * 被代理类
 * @author Administrator
 *
 */
public class Mi implements Target {

	@Override
	public String puchase() {
		return "秒杀小米8s";
	}
	
}
