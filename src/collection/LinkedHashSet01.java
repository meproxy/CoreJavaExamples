package collection;

import java.util.LinkedHashSet;

public class LinkedHashSet01 {
	// LinkedHashSet is sub class of HashSet and implements Set
	// Introduced in Java 1.4
	// Order of Insertion is Preserved
	// Duplicates are Not allowed
	public static void main(String[] args) {
		LinkedHashSet l1 = new LinkedHashSet();
		
		l1.add(221);
		l1.add(23);
		l1.add(22);
		l1.add(14);
		l1.add(6);
		
		System.out.println(l1);
		
	}

}
