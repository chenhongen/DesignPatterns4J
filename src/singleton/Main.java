package singleton;

public class Main {
	public static void main(String[] args) {
		Hungry h1 = Hungry.getHungry();
		
		Hungry h2 = Hungry.getHungry();
		System.out.println(h2.equals(h1));
		
		// Ĭ�Ϲ��캯������£���ͨ��new�����µ�ʵ����˽�л����캯���ɱ��⡣
		//Hungry h3 = new Hungry();
		//System.out.println(h3.equals(h1));
	}
}
