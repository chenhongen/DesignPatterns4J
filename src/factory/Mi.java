package factory;
/**
 * �����Ʒ��
 * @author che
 *
 */
public class Mi implements Phone{

	@Override
	public String start() {
		return "Ϊ��ɧ������";
	}
	
	public String ring() {
		return "������  ������ �⣡";
	}
}
