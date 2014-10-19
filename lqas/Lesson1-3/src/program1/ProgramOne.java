package program1;

import java.util.*;

public class ProgramOne{
 
    public static void main(String [] args) {
        // Elemtn which should be changed.
        String e1 = "elem2";
        // New value for element.
        String e2 = "elem22";
 
        // Declare and fill collection.
        ArrayList collection = new ArrayList();
        collection.add("elem1");
        collection.add("elem2");
        collection.add("elem2");
        collection.add("elem2");
        collection.add("elem5");
        collection.add("elem6");
        collection.add("elem7");
        collection.add("elem8");
        collection.add("elem9");
        collection.add("elem10");
       
        // Print collection.
        System.out.print("Collection data: ");
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
       
        // Change first half of collection.
        int size = collection.size();
        String tmp;
        for (int i = 0; i < size / 2; i++) {
            tmp = (String) collection.get(i);
            if (tmp.equals(e1)) {
                collection.set(i, e2);
            }
        }
       
        // Print changed collection.
        System.out.print("Changed collection data: ");
        iterator = collection.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
}