package mediator;

public class GirlDog extends Dog {
	
	public GirlDog() {
		super.gender = 0;
		//super.mediator.addDog2List(this);
	}
	
	public GirlDog(Mediator mediator) {
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
