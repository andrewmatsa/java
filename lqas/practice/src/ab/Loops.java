package ab;

import java.util.*;
import java.util.Map.Entry;

//import javax.print.attribute.standard.NumberUpSupported;

public class Loops {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	int a = 20;
		int b = 10;
		
		if (a>b)
		{
			System.out.println(a + " greater than " + b);
			if (a>5)
			{
				System.out.println(a + " greater than 5");
			}
		}
		else if (a<b)
		{
			System.out.println(a + " lower than " + b);
		}
		else
		{
			System.out.println(a + " equals " + b);
		}
		
	
			int grade = 2093; 
			switch(grade) { 
			case 10 : System.out.println("Excellent!"); 
			break; 
			case 20 : System.out.println("Well done");
			break; 
			default : System.out.println("Invalid grade"); 
			} 
			System.out.println("Your grade is " + grade); 
		 
			
		int x = 1; 
		while( x < 20 ){ 
			System.out.println("value of x : " + x); 
			// 
			//System.out.print("\n"); 
			if(x==5)
				break;
			x++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e){
				e.printStackTrace();
			}
			}*/
		/*for(int x = 10; x < 20; x++) { 
			System.out.println("value of x : " + x ); 
		} */
		/*int x;
		String [] numbers = {"10", "20", "30", "40", "50"}; 
		/*for(x=0; x<numbers.length;  x++ ){ 
			System.out.print( x );
			System.out.print(",");
		} */
		/*for (String y : numbers){
			System.out.println(y);
			}*/

	/*	List<String> a1 = new ArrayList<String>(); 
		a1.add("Zara"); 
		a1.add("Mahnaz"); 
		a1.add("Ayan");
		System.out.println(" ArrayList Elements"); 
		System.out.println("\t" + a1); 

		List<String> l1 = new LinkedList<String>(); 
		l1.add("Zara"); 
		l1.add("Mahnaz");
		l1.add("Ayan"); 
		System.out.println(" LinkedList Elements"); 
		System.out.print("\t" + l1);
		
		for (String str:l1)
		{
			if (str.equals("Zara"))
				System.out.println(str + " exists");
		}*/
		
		
			/*Map<String, String> m1 = new HashMap<String, String>(); 
			m1.put("Zara", "8"); 
			m1.put("Mahnaz", "31"); 
			m1.put("Ayan", "12"); 
			m1.put("Daisy", "14"); 
			System.out.println(" Map Elements");
			System.out.print("\t" + m1);
			
			for(Entry<String, String> e : m1.entrySet()) { 
				String key = e.getKey(); 
				String value = e.getValue(); 
				System.out.println(key + " " + value);
				
				} */

			LinkedHashSet hs = new LinkedHashSet(); 
			// add elements to the hash set 
			hs.add("B"); 
			hs.add("A"); 
			hs.add("D"); 
			hs.add("E"); 
			hs.add("C"); 
			hs.add("F");
			hs.add("F");
			hs.add("A");
			System.out.println(hs); 


	
	} 
		 

	
	
	} 
		

	


