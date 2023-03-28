package collection;

import java.util.HashSet;

public class HashSet01 {
	// HashSet Implements Set Interface
	// Insertion Order is not Preserved
	// Duplicates are Not allowed
	// It is fast in Searching, T.C = O(1)
	public static void main(String[] args) {
		HashSet h1 = new HashSet();
		h1.add(22);
		h1.add(33);
		h1.add(2);
		h1.add(44);
		h1.add(245);
		
		System.out.println(h1);
		
	}

}
