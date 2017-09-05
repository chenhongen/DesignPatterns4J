package prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 实现Cloneable接口
 * @author Administrator
 *
 */
public class ConcretePrototype implements Cloneable, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private Reference ref;
	
	public ConcretePrototype(String name, Reference ref) {
		super();
		this.name = name;
		this.ref = ref;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Reference getRef() {
		return ref;
	}

	public void setRef(Reference ref) {
		this.ref = ref;
	}

	@Override
	protected ConcretePrototype clone() {
		ConcretePrototype cp = null;
		try {
			cp = (ConcretePrototype)super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cp;
	}
	
	// 深拷贝：需要涉及类实现 Serializable 接口
	protected ConcretePrototype deepClone() {
		ByteArrayOutputStream bao = new ByteArrayOutputStream();
		ObjectOutputStream oos = null;
		ConcretePrototype cp = null;
		try {
			//将对象写入流中
			oos = new ObjectOutputStream(bao);
			oos.writeObject(this);
			
			//将对象从流中取出
            ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            cp = (ConcretePrototype) ois.readObject();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return cp;
	}
	
}
