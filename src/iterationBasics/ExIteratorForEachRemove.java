package iterationBasics;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class ExIteratorForEachRemove {
	public static void main(String[] args) {
		Set<String> c = new HashSet<String>();
		c.add("If you can keep your head when all about you");
		c.add("Are losing theirs and blaming it on you,");
		c.add("If you can trust yourself when all men doubt you,");
		c.add("But make allowance for their doubting too;");
		System.out.println(c);
		filter(c, "If");
		System.out.println(c);
	}
	public static void filter(Collection<String> c, String w) {
		for (String e : c) {
			if (e.startsWith(w)) {
				c.remove(e);
			}
		}
	}
}
