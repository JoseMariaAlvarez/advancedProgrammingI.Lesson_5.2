package map;

import java.util.*;

public class Frequency {
	public static void main(String[] args) {
		Map<Integer, Integer> frecs = new HashMap<>();
		String[] arrValues= {"5", "4", "32", "3", "4", "3", "2", "3", "4", "2", "5", "2", "3"};
		for (String a : arrValues) {
			// Increase the frequency of each string, or assign 1 to it the 1st time
			int value = Integer.parseInt(a);
			Integer frec = frecs.get(value);
			if (frec == null) {
				frecs.put(value, 1);
			} else {
				frecs.put(value, frec + 1);
			}
		}
		// The frequencies are shown iterating over the set of keys
		for (Integer value : frecs.keySet()) {
			int frec = frecs.get(value);
			char[] bar = new char[frec];
			Arrays.fill(bar, '*');
			System.out.println(value + ":\t" + new String(bar));
		}
	}	
}