package com.app.student;

public class Student implements Comparable<Student>{
    private int roll_no;
    private String name;
    private double marks;
    private String course;
	public Student(int roll_no, String name, double marks, String course) {
		super();
		this.roll_no = roll_no;
		this.name = name;
		this.marks = marks;
		this.course = course;
	}
	
	public String getName() {
		return name;
	}

	public double getMarks() {
		return marks;
	}

	public String getCourse() {
		return course;
	}

	@Override
	public String toString() {
		return "Student [roll_no=" + roll_no + ", name=" + name + ", marks=" + marks + ", course=" + course + "]";
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return Integer.compare(roll_no, o.roll_no);
	
	}
    
    
}
