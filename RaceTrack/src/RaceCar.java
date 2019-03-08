
public class RaceCar implements IRacer {
	
	String myName = "Racer X";
	double myMaxSpeed = 15.0;
	double myAcceleration = 1.0;
	double myCurrentSpeed = 1.0;
	
	@Override
	public String getName() {
		return myName;
	}
	@Override
	public double getCurrentSpeed() {
		return myCurrentSpeed;
	}
	@Override
	public void resetCurrentSpeed() {
		myCurrentSpeed = 0.0;
		
	}
	@Override
	public void accelerate() {
		myCurrentSpeed = myAcceleration + myCurrentSpeed;
		if (myCurrentSpeed > myMaxSpeed) {
			myCurrentSpeed = myMaxSpeed;
		}
		
		
	}
	public RaceCar(String name, double maxSpeed, double acceleration) {
		super();
		this.myName = name;
		this.myMaxSpeed = maxSpeed;
		this.myAcceleration = acceleration;
		this.myCurrentSpeed = 0.0;
	}

}
