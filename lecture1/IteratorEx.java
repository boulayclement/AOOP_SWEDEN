package lecture1;

import java.util.*;

public class IteratorEx {

	public static void main(String[] args) {
		LinkedList<String> countries = new LinkedList<String>();
		countries.add("A");
		countries.add("B");
		countries.add("C");
		ListIterator<String> iterator = countries.listIterator();
		// while (iterator.hasNext()) {
		//System.out.println(iterator.next());
		iterator.add("N");
		//System.out.println(iterator.next());
		//System.out.println(iterator.next());
		
		iterator = countries.listIterator();
		System.out.println(iterator.next()); // N
		iterator.remove(); // removed the N
		iterator.remove();
		System.out.println(iterator.next()); // A
		System.out.println(iterator.next()); // B
		System.out.println(iterator.next()); // C

		iterator = countries.listIterator();
		System.out.println(iterator.next()); // N
		System.out.println(iterator.next()); // A
		System.out.println(iterator.next()); // B
		// System.out.println(iterator.next()); // C

		//}

	}
}