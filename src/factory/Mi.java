package factory;
/**
 * 具体产品类
 * @author che
 *
 */
public class Mi implements Phone{

	@Override
	public String start() {
		return "为发骚而生！";
	}
	
	public String ring() {
		return "噔噔噔  噔噔噔 噔！";
	}
}
