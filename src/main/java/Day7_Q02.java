import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Day7_Q02 {
	/*
	 * 2. Write an example for Comparable and Comparator
	 */
	public static void main(String[] args) {

		Student s1 = new Student("001", "John", 4);
		Student s2 = new Student("002", "Arlo", 3);
		Student s3 = new Student("003", "Sera", 4);

		List<Student> stuList = new ArrayList<Student>();

		stuList.add(s1);
		stuList.add(s2);
		stuList.add(s3);
		
		System.out.println("No sorting: ");
		
		for (Student s : stuList) {
			System.out.println(s.getId() + " " + s.getName() + " " + s.getYear());
		}
		
		Collections.sort(stuList, new yearComparator());
		
		System.out.println("Sorting by year: ");
		
		for (Student s : stuList) {
			System.out.println(s.getId() + " " + s.getName() + " " + s.getYear());
		}

	}
}

//@Getter
//@Setter
//@AllArgsConstructor
class Student implements Comparable<Student> {
	private String id;
	private String name;
	private int year;

	public Student(String id, String name, int year) {
		this.id = id;
		this.name = name;
		this.year = year;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int compareTo(Student s) {
		return this.id.compareTo(s.getId());
	}
}

class yearComparator implements Comparator<Student> {

	public int compare(Student s1, Student s2) {
		if(s1.getYear() < s2.getYear()){
			return 1;
		}
		else if (s1.getYear()> s2.getYear()) {
			return -1;
		}
		return 0;
	}
}
