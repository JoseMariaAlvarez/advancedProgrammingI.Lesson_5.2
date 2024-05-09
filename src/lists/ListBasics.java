package lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListBasics {

	public static void main(String[] args) {
		
		List<String> l = new ArrayList<String>();
		l.add("One");
		l.add("Two");
		l.add("Three");
		l.add("Four");
		l.add("Five");

		System.out.println("This is the element in position 3: " + l.get(3));
		
		l.set(3, "Six");
		System.out.println("This is the element in position 3 after setting \"Six\" as new value: " +
							l.get(3));
		
		l.add(1, "Seven");
		System.out.println("This is the element in position 3 after adding \"Seven\" in position 1: " +
							l.get(3));
		
		l.remove(3);
		System.out.println("This is the list after removing the element at position 3: " +
							l.toString());
		
		l.remove("Six");
		System.out.println("This is the list after removing the element \"Six\": " +
							l.toString());
		
		l.addAll(Arrays.asList("Seven", "Eigth"));
		System.out.println("This is the list after adding the elements of list [\"Seven\", \"Eight\"]: " +
							l.toString());
		
		System.out.println("This is the first position where \"Seven\" appears: " + l.indexOf("Seven"));
		System.out.println("This is the last position where \"Seven\" appears: " + l.lastIndexOf("Seven"));
		
		Collections.fill(l.subList(2, 4), "Ten");
		System.out.println("This is the list after filling the sublist "
				+ "from position 2 to position 4 with the value \"Ten\": " + 
							l.toString());

	}

}
