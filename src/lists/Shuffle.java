package lists;

import java.util.*;
public class Shuffle {
	public static void main(String args[]) {
		// The original list is created
		List<String> original = new ArrayList<String>(
										Arrays.asList("one", "two", "four", "two", "three", "four", "five"));

		// a copy is created and shuffled
		List<String> duplicate = new ArrayList<>(original);
		Collections.shuffle(duplicate, new Random());
		// two iterators are used to compare both lists
		ListIterator<String> iterOriginal = original.listIterator();
		ListIterator<String> iterDuplicate = duplicate.listIterator();
		int samePosition = 0;
		while (iterOriginal.hasNext()) {
			if (iterOriginal.next().equals(iterDuplicate.next())) {
				samePosition++;
			}
		}
		//The result is printed on screen
		System.out.println(
				duplicate + ": " + samePosition + " in the same place.");
	}
}