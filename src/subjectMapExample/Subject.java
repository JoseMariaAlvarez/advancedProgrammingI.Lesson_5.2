package subjectMapExample;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Subject {
	private String name;
	private Map<Group, Set<Student>> groups;
	public static enum Group {A, B, C};

	public Subject(String n) {
		name = n;
		groups = new HashMap<>();
	}

	public Set<Student> group(Group gr) {
		return groups.get(gr);
	}

	public void addStudent(Group gr, Student st) {
		Set<Student> group;
		if ((st != null) && (gr != null) && !contains(st)) {
			group = groups.get(gr); // get the group
			if (group == null) {	  // create the group
				group = new HashSet<Student>();
				groups.put(gr, group);
			}
			group.add(st);          // add the student
		}		
	}

	public boolean contains(Student st){
		boolean found = false;
		Collection<Set<Student>> grs = groups.values();
		Iterator<Set<Student>> it = grs.iterator();
		while (!found && it.hasNext()) {
			found = it.next().contains(st);
		}
		return found;
	}
}	