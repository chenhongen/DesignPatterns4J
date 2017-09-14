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
			System.out.println("相亲成功");
			return dog;
		} else {
			System.out.println("相亲失败");
		}

		return null;
	}

}
