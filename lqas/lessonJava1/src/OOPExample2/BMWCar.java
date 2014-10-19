package OOPExample2;

public class BMWCar extends Car{

	private int maxSpeed;
	
	public BMWCar(String name, boolean hasRoof, int year, String country,
			Colour colour, int maxSpeed) {
		super(name, hasRoof, year, country, colour);
		this.maxSpeed = maxSpeed;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

}
