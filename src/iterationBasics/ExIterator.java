package iterationBasics;

import java.util.HashSet;
import java.util.Set;

import java.util.Iterator;

public class ExIterator {
	public static void main(String[] args) {
		Set<String> c = new HashSet<>();
		c.add("One");
		c.add("Two");
		c.add("Three");
		Iterator<String> iter = c.iterator();
		System.out.print("< ");
		while (iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
		System.out.println(">");
	}
}

