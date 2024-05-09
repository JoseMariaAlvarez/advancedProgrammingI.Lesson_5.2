package map;

import java.util.*;

public class Occurrences {
	public static void main(String[] args) {
		Map<String, Integer> frecs = new HashMap<String, Integer>();
		String[] arrValues= {"ao", "ir", "ea", "ea", "ir", "ea", "ao", "ea", "ir", "ed"};

		for (String s : arrValues) {
			// Increase the frequency of each string, or assign 1 to it the 1st time
			int frec = frecs.getOrDefault(s, 0);
			frecs.put(s, frec + 1);
		}
		// The frequencies are shown iterating over the set of keys
		for (String key: frecs.keySet()) {
			int frec = frecs.get(key);
			char[] bar = new char[frec];
			Arrays.fill(bar, '*');
			System.out.println(key + ": " + new String(bar));
		}
	}	
}