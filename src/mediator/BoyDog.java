package mediator;

public class BoyDog extends Dog {
	
	public BoyDog() {
		super.gender = 1;
		//super.mediator.addDog2List(this);
	}
	
	public BoyDog(Mediator mediator) {
		this();
		super.mediator = mediator;
	}

	@Override
	public Dog blindDate(Dog dog) {
		if(dog.gender != super.gender) {
			System.out.println("���׳ɹ�");
			return dog;
		} else {
			System.out.println("����ʧ��");
		}

		return null;
	}

}
