package bridge;

public class MiCompany extends Company {

	public MiCompany(Phone phone) {
		super(phone);
	}

	@Override
	String start() {
		return phone.start();
	}
	
}
