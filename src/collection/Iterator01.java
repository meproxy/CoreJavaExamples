package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator01 {
	// It can be used in any class of collection
	// It can traverse in forward direction only
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add(32);
		a1.add(21);
		a1.add(2);
		a1.add(5);
		a1.add(66);
		
		System.out.println(a1);
		
		Iterator i1 = a1.iterator();
		
		while(i1.hasNext()) {
			// Integer j = (Integer)i1.next(); // downcasting as it belongs to object
			System.out.println(i1.next()); // everytime going to next and fetching data also
		}
		// we can do this by loops also
	}

}
