package set;

import java.util.*;

public class Duplicates {
	public static void main(String[] args) {
		Set<String> s = new HashSet<>();
		String [] words = {"one", "two", "four", "two", "three", "four", "five"};
		for (String w: words) { 
			if (!s.add(w)) {
				System.out.println("duplicate: " + w);
			}
		}
		System.out.println(s.size() + " detected words: " + s);
	}
}