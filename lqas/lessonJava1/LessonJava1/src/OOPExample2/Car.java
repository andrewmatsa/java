package OOPExample2;

public class Car {
	
	private String name;
	private boolean hasRoof;
	private int year;
	private String country;
	private Colour colour;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isHasRoof() {
		return hasRoof;
	}
	public void setHasRoof(boolean hasRoof) {
		this.hasRoof = hasRoof;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Colour getColour() {
		return colour;
	}
	public void setColour(Colour colour) {
		this.colour = colour;
	}
	
	public Car(String name, boolean hasRoof, int year, String country, Colour colour) {
		super();
		this.name = name;
		this.hasRoof = hasRoof;
		this.year = year;
		this.country = country;
		this.colour = colour;
	}
	
	public Car(int year) {
		super();
		this.year = year;
	}
	
	public void ride(){
		if (speed() > 5){
			
		}
	}
	
	public int speed(){
		int setSpeed = 6;
		return setSpeed;
	}
	
	public static Car getNewestCar(Car car1, Car car2){
		if (car1.year > car2.year)
			return car1;
		else return car2;
	}
}
