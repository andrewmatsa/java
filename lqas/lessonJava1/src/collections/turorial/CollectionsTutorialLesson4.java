package collections.turorial;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class CollectionsTutorialLesson4 {

	public static void main(String[] args) {	
		Iterator<String> dynamicCollectionIterator = getDynamicCollection(10).iterator();
		while(dynamicCollectionIterator.hasNext()){
			System.out.println(dynamicCollectionIterator.next());
		}	
	}
	
	public static List<String> getDynamicCollection(int size){
		List<String> dynamicList = new ArrayList<String>();
		for (int i = 0; i < size; i++){
			Random rnd = new Random();
			int rndNumber = i + rnd.nextInt();
			dynamicList.add("collection element " + rndNumber);
		}
		return dynamicList;
	}

}
