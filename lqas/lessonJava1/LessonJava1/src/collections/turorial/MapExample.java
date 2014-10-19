package collections.turorial;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Iterator;

public class MapExample {
	
	public static void main(String[] args){
		
		List<String> list = Arrays.asList("10","2");
		List<String> list1 = Arrays.asList("10","2", "asd");
		List<String> list2 = Arrays.asList("10","2", "asd", "asda", "asdas");
		
		Map<Integer, List<String>> map = new HashMap<Integer, List<String>>();
		
		map.put(1, list);
		map.put(2, list1);
		map.put(3, list2);

		printMapListElements(map);
	}
	
	//not used, just explore
	/*
	public static int getHashMapLength(Map<Integer, List<String>> hash){
		if (hash.size() > 0)
			return hash.size();
		else if (hash.size() == 0)
			return hash.size() + 1;
		else return 0;
	}
	*/
	
	public static void printMapListElements(Map<Integer, List<String>> hash){
		for (Entry<Integer, List<String>> entry : hash.entrySet()){
			System.out.print("key " + entry.getKey() + ": { ");
			iterateListAndOutputIt(entry.getValue());
			System.out.println(" }");
		}
	}
	
	public static void iterateListAndOutputIt(List<String> list){
		Iterator<String> listIterator = list.iterator();
		StringBuilder sb = new StringBuilder();
		for (;;){
			sb.append(listIterator.next());
			if (! listIterator.hasNext()){
				break;
			}
			sb.append(" , ");
		}
		System.out.print(sb);
	}	
}


