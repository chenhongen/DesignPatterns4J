package factory;

/**
 * �򵥣���̬����������϶ȱȽϸ�
 * @author che
 *
 */
public class SimpleFactory {
	public String purchase(String model) {
		String slogan = "none";
		// ȱ�㣺������model����ʱ����Ҫ�޸Ĵ˴�
		/*switch(model) {
		case "Mi":
			slogan = new Mi().start();
			break;
		case "Apple":
			slogan = new Apple().start();
			break;
		}*/
		
		// ����(��ȫ��)
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
