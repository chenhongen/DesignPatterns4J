package composite;

public abstract class ParentComponent extends Component{
	public abstract void add(Component c);
    public abstract void remove(Component c); 
    public abstract Component getChild(int i);
}
