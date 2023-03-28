package collection;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafe01 {

	public static void main(String[] args) {
		// FAILSAFE works with CopyOnWriteArrayList Only
		// Concurrent addition is not allowed and will fail safely
		CopyOnWriteArrayList c1 = new CopyOnWriteArrayList();

		c1.add(22);
		c1.add(33);
		c1.add(442);
		c1.add(252);

		System.out.println(c1);

		Iterator i1 = c1.iterator();

		while (i1.hasNext()) {
			System.out.println(i1.next());
			c1.add(100); // this will failing to get added and it is failing safely withot Exception
		}

	}

}
