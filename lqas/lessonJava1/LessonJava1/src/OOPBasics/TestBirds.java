package OOPBasics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestBirds {

	public static void main(String[] args) {
		
		Bird brd = new Bird(10, 2 , "leleka");
		Penguin p = new Penguin();
		p.getAge();
		
		Bird yyy = new Penguin(4);
		yyy.fly();
		/*
		Bird j = p.returnMeAPenguin();
		
		Bird.fly(4);
		
		yyy.fly(4);
		yyy.fly();*/
		/*
		List<String> list = new ArrayList<String>();
		Set<String> list2 = new HashSet<String>();
		list.add("asf");
		list.add("asd");
		
		list2.add("asf22222");
		list2.add("asd22222");
		*/
	}

}
