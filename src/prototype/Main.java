package prototype;

public class Main {
	public static void main(String[] args) {
		ConcretePrototype cp1 = new ConcretePrototype("ËÎÖÙ»ù", new Reference());
		ConcretePrototype cp2 = cp1.clone();
		cp2.setName("°²¼ª");
		
		System.out.println(cp1 == cp2); // false
		System.out.println(cp1.getRef() == cp2.getRef()); // true£¬Ç³¿½±´
		
		ConcretePrototype cp3 = cp1.deepClone();
		
		System.out.println(cp1 == cp3); // false
		System.out.println(cp1.getRef() == cp3.getRef()); // false£¬Éî¿½±´
	}
}
