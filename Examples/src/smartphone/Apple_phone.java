package smartphone;

public class Apple_phone implements IDialer {

	@Override
	public void call(String phoneNumber) {
		System.out.println("Iphone calling " + phoneNumber);
		
	}

}
