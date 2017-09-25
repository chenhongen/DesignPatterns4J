package composite;

import java.util.ArrayList;

public class Composite extends ParentComponent{
	private ArrayList<Component> list = new ArrayList<Component>();
	
	public Composite(String name) {  
        super.name = name;  
    }
	
	@Override
	public void add(Component c) {
		list.add(c);
	}

	@Override
	public void remove(Component c) {
		list.remove(c);
	}

	@Override
	public Component getChild(int i) {
		return list.get(i);
	}

	@Override
	public void operate() {
		System.out.println("P:"+super.name);
		for(Object obj : list) {  
            ((Component)obj).operate();  
        }
	}
	
}
