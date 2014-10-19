import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class TutorialJava {

	public static void main(String[] args) {
		
		int a1 = 18;
		
		Integer a = new Integer (9);
		Double b = new Double(10);
		
		
		b.floatValue();
		Double.parseDouble("124.2");
		Double.valueOf("100.2");
		
		String row = "a lot of text";
		String row1 = new String ("aldkfhsdklf");
		
		row.replace("lot", "begemot");
		
		StringBuffer sb = new StringBuffer("sasdf");
		StringBuilder sbasd = new StringBuilder("sasdf");

		String s = "123123";
		System.out.println(s);
		
		/*
		String row = "a lot of text";
		
		System.out.println(row.toUpperCase());
		
		StringBuilder stb = new StringBuilder("a lot of text");
		StringBuffer stbf = new StringBuffer("a lot of text");
		
		char [] data = {'a', 'b' , 'c'};
		
		String charData = new String (data);
	
		String [] a = row.split(" ");
		for (int i=0; i < a.length; i++){
			System.out.println(a[i] + "\n");
		}*/
		
		
		
		/*String row = "900.0";
		
		System.out.println(row.matches("[1-9][\\d]{2}\\.[0-9]"));
		 */
	/*
	String row = "900.0";
		
	double parsedRow = Double.parseDouble(row);	
	
	if (parsedRow > 800){
		System.out.println(parsedRow + 400);
		if (parsedRow < 901) {
			System.out.println(Math.sin(parsedRow));
			System.out.println(parsedRow);
			
			boolean a = row.contains("00");
			
			if (a){
				System.out.println(row + 100);
				System.out.println(100 + "");
			}
			
			else {
				System.out.println(row + 200);
			}
		}
	}
	*/
	/*	
    for (int i=0,j=0; i< 10 && j < 15; i++, j--){
    	
    }*/
		
		
	int counter = 0;
	/*
	while (counter < 10){
		System.out.println(counter);
		counter++;
	}
	*/
	
	System.out.println("----------------------------");
	
	/*
	do{
		System.out.println(counter);
		counter--;
	}while(counter < 20);
		
	
	for (int i = 0; i < 10; i++){
		System.out.println(i+2);
	}
	
	for (int i = 0; i < 10; i++){
		for (int j = 0; j < 10; j++){
			System.out.println("[i]:" + i + " , " + "[j]:" + j);
		}	
	}	
	
	for (  ;  ;  ){
		
	}
	
	for (int i=0; i < 10; i ++){
		if (counter % 2 == 0){
			counter++;
			System.out.println(counter);
		}
		else {
			continue;
		} 		
	}	
	*/
	//System.out.println(getLastStringSymbol(""));
	
	
	String [] array = new String[getDynamicArraySize("asdasfklasjfkla")];
	
	for (int i = 0; i < array.length; i ++){
		array[i] = i+10 + "";
		System.out.println(array[i]);
	}
	
	System.out.println("----------------------");
	
	for (String j : array){
		System.out.println(j);
		if (j.contains("14")){
			System.out.println("----------------------");
			System.out.println(j);
			break;
		}
	}
	
  }
	
  public static String getLastStringSymbol(String symbols){
	  return symbols.substring(symbols.length()-1);
  }
  
  public static int getDynamicArraySize(String symbols){
	  List <String> myFirstCollection = new ArrayList<String>();
	  
	  String [] array2 = new String[getDynamicArraySize("asdasfklasjfkla")];
	  //List <String> mySecondCollection = Collections.;
	  return symbols.length();
  }
	
}



