package factory;
/**
 * 具体产品类
 * @author che
 *
 */
public class Apple implements Phone{

	@Override
	public String start() {
		return "放开我，硫克！";
	}
	
	public String ring() {
		return "噔 噔 噔 噔 噔 噔噔噔！";
	}
}
