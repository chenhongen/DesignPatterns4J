package composite;

public class Leaf extends Component{
	public Leaf(String name) {  
        super.name = name;  
    }
	
	
	@Override
	public void operate() {
		System.out.println("C:"+super.name);
	}

}
