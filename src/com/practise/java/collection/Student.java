package com.practise.java.collection;

@SuppressWarnings("rawtypes")
public class Student implements Comparable {

	int rollno;
	String name;

	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}

	public int compareTo(Object obj) {
		Student s1 = (Student) obj;
		if (this.rollno < s1.rollno) {
			return -1;
		} else if (this.rollno > s1.rollno) {
			return 1;
		} else {
			return 0;
		}
	}

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + rollno;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (rollno != other.rollno)
			return false;
		return true;
	}

	public String toString() {
		return this.rollno + "  " + this.name;
	}
}
