package smartphone;

public class SmartPhoneTester {

	public static void main(String[] args) {
		IDialer phone1 = new Android();
	    IDialer phone2 = new Apple_phone();

	    phone1.call("867-5309");
	    phone2.call("867-5309");

	}

}
