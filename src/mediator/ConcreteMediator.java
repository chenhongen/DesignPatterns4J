package mediator;

public class ConcreteMediator extends Mediator {
	
	@Override
	Dog pair(int gender) {
		for(Dog dog:super.list) {
			if(gender != dog.gender) {
				return dog;
			}
		}
		return null;
	}

}
