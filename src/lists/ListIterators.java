package lists;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIterators {

	public static void main(String[] args) {
		
		List<String> l = new ArrayList<String>();
		l.add("One");
		l.add("Two");
		l.add("Three");
		l.add("Four");
		l.add("Five");

		System.out.print("List in forward order: ");
		ListIterator<String> lif = l.listIterator();
		if (lif.hasNext()) {
			System.out.print(lif.next());
			while(lif.hasNext()) {
				System.out.print(", " + lif.next());
			}
		}

		System.out.print("\n\nList in forward order: ");
		ListIterator<String> lir = l.listIterator(l.size());
		if (lir.hasPrevious()) {
			System.out.print(lir.previous());
			while(lir.hasPrevious()) {
				System.out.print(", " + lir.previous());
			}
		}
	}
}
