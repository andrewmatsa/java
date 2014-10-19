package program2;

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ProgramTwo {
	public static void main(String[] args) {
		// Declare and fill collection.
		ArrayList collection = new ArrayList();
		collection.add("elem1");
		collection.add("elem2");
		collection.add("elem2");
		collection.add("elem4");
		collection.add("elem5");
		collection.add("elem6");
		collection.add("elem6");
		collection.add("elem6");
		collection.add("elem9");
		collection.add("elem10");

		// Print collection.
		System.out.print("Collection data: ");
		Iterator iterator = collection.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();

		// Reverse collection.
		int size = collection.size();
		String first, last;
		for (int i = 0; i < size / 2; i++) {
			first = (String) collection.get(i);
			last = (String) collection.get(size - i - 1);
			collection.set(size - i - 1, first);
			collection.set(i, last);
		}

		// Print changed collection.
		System.out.print("Changed collection data: ");
		iterator = collection.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();

		// remove duplicates
		System.out.print("Without duplicates: ");
		ArrayList newList = new ArrayList(new LinkedHashSet(collection));
		Iterator it = newList.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}

	}

}
