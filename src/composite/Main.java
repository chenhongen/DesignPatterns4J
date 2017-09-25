package composite;

public class Main {
	// 组合模式：使用户无差别操作父子结构对象
	public Main() {
		Leaf leaf1 = new Leaf("子节点1");
		Leaf leaf2 = new Leaf("子节点2");
		
		Composite parent = new Composite("父节点");
		parent.add(leaf1);
		parent.add(leaf2);
		
		parent.operate();
		
	}
}
