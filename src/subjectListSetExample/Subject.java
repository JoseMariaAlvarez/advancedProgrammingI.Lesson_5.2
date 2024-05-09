package subjectListSetExample;

import java.util.*;

public class Subject {
	private String name;
	private List<Set<Student>> groups;
	public static enum Group {A, B, C};

	public Subject(String n) {
		name = n;
		int len = Group.values().length;   				
		groups = new ArrayList<>(len);
		for (int i = 0; i < len; i++) {
			groups.add(new HashSet<Student>());
		}
	}

	public Set<Student> group(Group gr) {
		if (gr == null) {
			throw new RuntimeException("Invalid arguments");
		}
		return groups.get(gr.ordinal());
	}
	public void addStudent(Group gr, Student st) {
		if ((st != null) && (gr != null) && !contains(st))
			groups.get(gr.ordinal()).add(st);	
	}

	public boolean contains(Student st){
		boolean found = false;
		ListIterator<Set<Student>> it = groups.listIterator();
		while (!found && it.hasNext())
			found = it.next().contains(st);
		return found;
	}
}	
