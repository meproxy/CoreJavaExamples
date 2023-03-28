package collection;

import java.util.ArrayList;

public class ArrayList01 {

	public static void main(String[] args) {
		ArrayList ar1 = new ArrayList();
		
		ar1.add(222);
		ar1.add(333);
		ar1.add(444);
		
		System.out.println(ar1);
		
		ArrayList ar2 = new ArrayList();
		ar2.add("prasant");
		ar2.add(1);
		ar2.add('g');
		ar2.add(2.2);
		
		
		
		System.out.println(ar2);
		
		ar1.add(ar2);
		System.out.println(ar1);
		
		ar1.add(2,"pws");
		System.out.println(ar1);
		
		ArrayList ar3 = new ArrayList();
		// We are reserving minimum capacity to 2 here
		ar3.ensureCapacity(20);
		System.out.println(ar3.size());
		// Size is how much objects we have added and capcity is how much minimum space to add object it has
		ar3.add("p2");
		ar3.add(5);
		ar3.add(33);
		ar3.add(444);
		System.out.println(ar3.size());
		System.out.println(ar3);
		
		
	}

}
