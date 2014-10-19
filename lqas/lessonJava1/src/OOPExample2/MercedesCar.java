package OOPExample2;

public class MercedesCar extends Car{
	
	private int minSpeed;
	
	public MercedesCar(String name, boolean hasRoof, int year, String country,
			Colour colour, int minSpeed) {
		super(name, hasRoof, year, country, colour);
		this.minSpeed = minSpeed;
	}

	public int getMinSpeed() {
		return minSpeed;
	}

	public void setMinSpeed(int minSpeed) {
		this.minSpeed = minSpeed;
	}

}