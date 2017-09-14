package mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * �н��߳�����
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
