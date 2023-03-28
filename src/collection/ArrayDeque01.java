package collection;

import java.util.ArrayDeque;

public class ArrayDeque01 {

	public static void main(String[] args) {
		ArrayDeque q1 = new ArrayDeque();
		q1.add(22);
		q1.add(33);
		q1.addFirst('e'); // will add element at first
		q1.addLast("ddd"); // will add element at last
		System.out.println(q1);

		// offer method may add or may not add
		q1.offer(333);
		q1.offerFirst(3);
		q1.offerLast("4a4");
		

		System.out.println(q1);
	}

}
