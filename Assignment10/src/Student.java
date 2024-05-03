
public class Student implements Comparable<Student> {
	
	private int roll_no;
	private String name;
	private int marks;
	
	
	@Override
	public String toString() {
		return "Student [roll_no=" + roll_no + ", name=" + name + ", marks=" + marks + "]";
	}


	public Student(int roll_no, String name, int marks) {
		super();
		this.roll_no = roll_no;
		this.name = name;
		this.marks = marks;
	}


	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return o.marks - this.marks;
		//return 0;
	}

}
