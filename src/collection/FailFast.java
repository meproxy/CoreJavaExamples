package collection;

import java.util.ArrayList;

import java.util.Iterator;

public class FailFast {

	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add(32);
		a1.add(21);
		a1.add(2);
		a1.add(5);
		a1.add(66);

		System.out.println(a1);

		// After doing Structural or Concurrent Modifiacation

//		for(int i =0; i <=a1.size(); i++) {
//			System.out.println(a1.get(i));
//			a1.add(100); // this will make it to run infite times
//		}

		Iterator itr1 = a1.iterator();

		while (itr1.hasNext()) {
			System.out.println(itr1.next());
			a1.add(100);  // It will lead to throw Concurrent modification Error and it is called FAILFAST
		}

	}

}
