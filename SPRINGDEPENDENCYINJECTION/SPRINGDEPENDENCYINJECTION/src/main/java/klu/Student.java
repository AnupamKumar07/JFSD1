package klu;

public class Student {
	int id;
	String name;
	String dept;
	
	public Student(int id, String name, String dept)
	{
		this.id = id;
		this.name = name;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}
}
