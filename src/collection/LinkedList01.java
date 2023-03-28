package collection;

import java.util.LinkedList;

public class LinkedList01 {

	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.add(22);
		l1.add(23);
		l1.add(22);
		System.out.println(l1);
		System.out.println(l1.indexOf(22)); // will get index of first dublicate element 
		System.out.println(l1.lastIndexOf(22)); // will get index of dublicate element present at last place
		System.out.println(l1.lastIndexOf(2333322)); // will give random index for element not present
		
		
		LinkedList l2 = new LinkedList();
		l2.add("ww");
		l2.add('s');
		l2.add(22);
		System.out.println(l2);
		System.out.println(l2.indexOf('s'));
		l2.addFirst(222); // adding at head position
		l2.addLast(222); // adding at tail position
		l2.add(2, 9933); // adding at given index
		System.out.println(l2); // 
		System.out.println(l2.indexOf('s'));
		System.out.println(l2.peek()); // will give first element as output
		System.out.println(l2);
		System.out.println(l2.poll()); // will give first elemnt as output and also remove/delete it from the linked list or it's position
		System.out.println(l2);
		System.out.println(l2.get(3)); // fetching particular index element
		
		System.out.println(l2.getFirst());	// will fetch first element
		System.out.println(l2.getLast());	// will fetch last element
		
		
	}

}
