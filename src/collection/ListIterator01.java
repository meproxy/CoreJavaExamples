package collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterator01 {
	// It is used in List based classes ONLY
	// We can traverse in reverse direction also
	// for non list based class if you want to traverse backward first move there elements to list class and then reverse it then again move them back to the non list based class
	
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add(32);
		a1.add(21);
		a1.add(2);
		a1.add(5);
		a1.add(66);
		
		System.out.println(a1);
		
		ListIterator li1 = a1.listIterator(a1.size());
		while(li1.hasPrevious()) {
			System.out.println(li1.previous()); //going to previous element from last element and also fetching the data
		}
	}
}
