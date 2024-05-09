package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoreCollectionSortedExamples {

	public static void main(String[] args) {
		
		List<String> l = new ArrayList<String>();
		l.add("One");
		l.add("Two");
		l.add("Three");
		l.add("Four");
		l.add("Five");

		System.out.println("Original list: " + l.toString());

		System.out.println("Size of list: " + l.size());
		System.out.println("Is this list empty?: " + l.isEmpty());
		System.out.println("Does this list contains \"Three\"?: " + l.contains("Three"));
		
		l.remove(2);
		System.out.println("List after removing element at position 2: " + l.toString());
		
		l.remove("Five");
		System.out.println("List after removing element \"Five\": " + l.toString());
		
		System.out.println ("Does this list contains list [\"One\", \"Four\"]?: " + 
		                    l.containsAll(new ArrayList<>(Arrays.asList("One", "Four"))));

		l.addAll(new ArrayList<>(Arrays.asList("Three", "Five")));
		System.out.println("List after adding [\"Three\", \"Five\"]: " + l.toString());

		l.removeAll(new ArrayList<>(Arrays.asList("Three", "Five")));
		System.out.println("List after removing [\"Three\", \"Five\"]: " + l.toString());

		l.retainAll(new ArrayList<>(Arrays.asList("Four", "Two")));
		System.out.println("List after retaining [\"Four\", \"Two\"]: " + l.toString());

		l.clear();
		System.out.println("List after clearing: " + l.toString());
		
		l.addAll(new ArrayList<>(Arrays.asList("One", "Four")));
		String [] as = new String[l.size()];
		as = l.toArray(as);
		
		System.out.println("Array from list [\"One\", \"Four\"]: " + Arrays.toString(as));


	}

}
