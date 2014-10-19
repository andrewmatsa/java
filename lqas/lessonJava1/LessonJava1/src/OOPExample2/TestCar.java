package OOPExample2;

import java.util.ArrayList;
import java.util.List;

public class TestCar {
	
	public static void main(String... args){
		SpecificCar redCar = new SpecificCar("name1", 10, "ukraien");
		MercedesCar mCar = new MercedesCar("name1",true, 100, "ukraien", new Colour(10,9,2), 9);
		BMWCar bCar = new BMWCar("name1",true, 100, "ukraien", new Colour(35,9,2), 9);
	
		List<Car> carList = new ArrayList<Car>();
		carList.add(redCar);
		carList.add(mCar);
		carList.add(bCar);
	}
}
