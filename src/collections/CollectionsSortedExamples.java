package collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsSortedExamples {

	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		l.add("One");
		l.add("Two");
		l.add("Three");
		l.add("Four");
		l.add("Five");
		
		System.out.println("Original list: " + l.toString());
		
		Collections.reverse(l);
		System.out.println("Reversed list: " + l.toString());
		
		Collections.shuffle(l);
		System.out.println("Reversed and shuffled list: " + l.toString());

		Collections.sort(l);
		System.out.println("Reversed and shuffled and sorted list: " + l.toString());
		
		System.out.println("Max element is the list is: " + Collections.max(l)); 

		System.out.println("The position of element \"Three\" in the list is " + Collections.binarySearch(l, "Three")); 
		System.out.println("The position of element \"Six\" in the list is " + Collections.binarySearch(l, "Six")); 
		
		Collections.fill(l, "One");
		System.out.println("Filled list: " + l);

		ArrayList<String> l2 = new ArrayList<>(Arrays.asList("Two", "Two", "Two"));
		System.out.println("List filled from constructor argument: " + l2);
		
		Collections.copy(l, l2);
		System.out.println("Copied list: " + l);

		
	}
}