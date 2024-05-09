package iterationBasics;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExIteratorRemove {
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
		Iterator<String> iter = c.iterator();
		while (iter.hasNext()) {
			if ((iter.next()).startsWith(w)) {
				iter.remove();
			}
		}
	}
}
