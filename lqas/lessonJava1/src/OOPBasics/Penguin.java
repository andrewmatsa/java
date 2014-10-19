package OOPBasics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Penguin extends Bird{

	public int age;
	//Bird b = new Bird ();
	
	public Penguin(int age) {
		super();
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Penguin(){
		
	}
	
	public void fly(){
		System.out.println("fly like a penguin");
		System.out.println(ggggg);
		System.out.println(wings);
	}
	/*
	public Bird returnMeAPenguin(){
		return new Penguin();
	}
	
	public List<Bird> returnMeABirdList(){
		List<Bird> list = new ArrayList<Bird>();
		return list;
	}
	
	public void printCollection(Collection<String> list){
		
		Iterator it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		Collection cl = new ArrayList();
	}
	*/
}
