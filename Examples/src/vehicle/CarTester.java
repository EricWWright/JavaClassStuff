package vehicle;

public class CarTester {

	public static void main(String[] args) {
		CarMpg car1 = new CarMpg(1200, 1500, 12);
	    System.out.println("Car1 gets " + car1.calculateMPG() + " MPG" );

	    CarMpg car2 = new CarMpg(27000, 28000, 30);
	    System.out.println("car2 gets " + car2.calculateMPG() + " MPG" );

	}

}
