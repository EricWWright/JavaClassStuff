package vehicle;

public class CarMpg implements IDrivable {

	// class member variables
	  private double startMiles; 
	  private double endMiles; 
	  private double gallons; 

	  // set the car trip details
//	  public void setTrip(double start, double end, double gals) {
//	      startMiles = start;
//	      endMiles   = end;
//	      gallons    = gals;
//	  }
	  public CarMpg(double start, double end, double gals) {
	      startMiles = start;
	      endMiles   = end;
	      gallons    = gals;
	  }

	  // calculate miles-per-gallon
	  public double calculateMPG() {
	      return (endMiles - startMiles) / gallons;
	  }

	@Override
	public void TurnLeft() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void TurnRight() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void SpeedUp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void SlowDown() {
		// TODO Auto-generated method stub
		
	}
}
