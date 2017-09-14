package mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * 中介者抽象类
 * @author che
 *
 */
public abstract class Mediator {
	List<Dog> list = new ArrayList<Dog>();
	
	void addDog2List(Dog dog) {
		list.add(dog);
	}
	
	abstract Dog pair(int gender);
}
