package iterationBasics;

import java.util.HashSet;
import java.util.Set;

public class IteratorExampleForEach {
	public static void main(String[] args) {
		Set<String> c = new HashSet<String>();
		c.add("One");
		c.add("Two");
		c.add("Three");
		System.out.print("< ");
		for (String e : c) {
			System.out.print(e + " ");
		}
		System.out.println(">");
	}
}