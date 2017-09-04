package factory;

/**
 * 简单（静态）工厂：耦合度比较高
 * @author che
 *
 */
public class SimpleFactory {
	public String purchase(String model) {
		String slogan = "none";
		// 缺点：当有新model增加时，需要修改此处
		/*switch(model) {
		case "Mi":
			slogan = new Mi().start();
			break;
		case "Apple":
			slogan = new Apple().start();
			break;
		}*/
		
		// 反射(类全名)
		try {
			slogan = ((Phone)Class.forName("factory."+model).newInstance()).start();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return slogan;
	}
}
