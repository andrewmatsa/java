package OOPBasics;

import java.util.Collections;

public class Bird{

	public int age;
	public int wingsQuantity;
	public String name;
	private boolean hasNest;
	protected int wings;
	String ggggg;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWingsQuantity() {
		return wingsQuantity;
	}

	public void setWingsQuantity(int wingsQuantity) {
		this.wingsQuantity = wingsQuantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isHasNest() {
		return hasNest;
	}

	public void setHasNest(boolean hasNest) {
		this.hasNest = hasNest;
	}

	public int getWings() {
		return wings;
	}

	public void setWings(int wings) {
		this.wings = wings;
	}

	public String getGgggg() {
		return ggggg;
	}

	public void setGgggg(String ggggg) {
		this.ggggg = ggggg;
	}

	public Bird(int wingsQuantity, String name, boolean hasNest, int wings,
			String ggggg) {
		super();
		this.wingsQuantity = wingsQuantity;
		this.name = name;
		this.hasNest = hasNest;
		this.wings = wings;
		this.ggggg = ggggg;
		age ++;
		fly();
		String g = gav();
	}

	public Bird(){
		super();
	}

	public Bird(int age) {
		super();
		this.age = age;
	}
	
	public Bird(int age, int wingsQuantity, String name) {
		this(age);
		this.age = age;
		this.wingsQuantity = wingsQuantity;
		this.name = name;
	}

	public void fly(int a){
		gav();
		//age = 7;
		System.out.println("fly like a bird -   " + a);
	}
	
	public static void fly(){
		System.out.println("fly like a bird -   ");
	}
	
	public static String gav(){
		return "gav 33333 ";
	}
	
	
	
}
