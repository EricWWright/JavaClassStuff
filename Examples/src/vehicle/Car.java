package vehicle;

public class Car {
	String color = "Blue";
	int year = 2019;
	//Engine myEngine = new Engine();
	
	void start() {
		// implement the Start method here
		System.out.println("Your car has started");
	}
	
	void stop() {
		// implement the Stop method here
		System.out.println("Your car has stoped");
	}
	
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car();
		
		car1.start();
		car2.start();
		car1.stop();
		car2.stop();
		
		System.out.println(car1.color);
		System.out.println(car2.color);
	}
}