package OOPExample2;

public class SpecificCar extends Car{
	
	public SpecificCar(String name, int year, String country) {
		super(name, false, year, country, new Colour(10,0,0));
		// TODO Auto-generated constructor stub
		
	}
	
	@Override
	public int speed(){
		int setSpeed = 4;
		return setSpeed;
	}
	
	public int speed(int a){
		int setSpeed = 0;
		if (a < 5){
			setSpeed = 4;
		}
		return setSpeed;
	}
}
