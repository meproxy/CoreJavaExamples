package collection;

import java.util.TreeSet;

public class TreeSet01 {
		// TreeSet implements Set Interface
		// Order of data insertion is not preserved
		// It follows Binary Search data Structure to store it's elements
		// For output it follows In Order Traversal
		// 
	public static void main(String[] args) {
		TreeSet t1 = new TreeSet();
		t1.add(22);
		t1.add(222);
		t1.add(33);
		t1.add(1);
		t1.add(2);
		t1.add(4);
		
		System.out.println(t1);
		
		// higher & lower never gives the inserted value if not present it will give you null
		System.out.println(t1.higher(22));
		System.out.println(t1.lower(2));
		System.out.println(t1.higher(222));
		
		// celing & floor gives that inserted value only if it is present or respective if not present will give null
		System.out.println(t1.ceiling(225));
		System.out.println(t1.floor(200));
		System.out.println(t1.ceiling(3));
		
	}

}
