package collection;

import java.util.PriorityQueue;

public class PriorityQueue01 {

	public static void main(String[] args) {
		// Implements Deque Interface
		// Hetrogenous type Data & Null value are Not Allowed
		// Index based Operations Not allowed
		// Oredr of Insertion is NOT preserved
		// Elements are processed by their properties
		// It creates Min Heap Tree of it's elements and store that in that Order Only
		PriorityQueue p1 = new PriorityQueue();
		p1.add(22);
		p1.add(33);
		p1.add(221);
		p1.add(2);
		p1.add(23);
		p1.add(22);
		p1.add(2222);
		
		System.out.println(p1);
		
		PriorityQueue p2 = new PriorityQueue();
		p2.add("ss");
		p2.add("www");
		p2.add("ss");
		p2.add("q");
		
		System.out.println(p2);
	}

}
