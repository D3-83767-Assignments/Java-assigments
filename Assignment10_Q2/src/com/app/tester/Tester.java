package com.app.tester;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import com.app.student.Student;
import com.app.student.StudentHelper;

public class Tester {
	
	public static int menu(Scanner sc) {
		System.out.println("Enter choice : \n"+
	"0.Exit\n"+
	"1.Add student\n"+
	"2.display all student sorted on rollno\n"
	+"3.display all students sorted on name\r\n"
	+"4.display all students sorted on marks in desc order\n"
	+"5.display all students sorted on course\n");
	 return sc.nextInt();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student [] student = new Student[4];
		Scanner sc = new Scanner(System.in);
		int choice;
		
	    while(true) {
	    	switch(choice = menu(sc)) {
	    	case 0:
	    		break;
	    	case 1:
	    		for(int i =0; i<4; i++){
	    		System.out.println("Enter student");
	    		System.out.println("Enter roll_no, name, marks, course");
	    		int roll_no = sc.nextInt();
	    		String name = sc.next();
	    		int marks = sc.nextInt();
	    		String course = sc.next();
	    		student[i] = new Student(roll_no,name,marks,course);
	    		}
	    		
	    		break;
	    	case 2:
	    		System.out.println("Printing array in sorted order : ");
	    		Arrays.sort(student);
	    		for (Student stu: student)
	    		System.out.println(stu);
	    		break;
	    	case 3:
	    		System.out.println("displaying student sorted on name :");
	    		Comparator <Student> c= new StudentHelper();
	    		Arrays.sort(student, c);
	    		for(Student s: student)
                   System.out.println(s);	    		
	    		break;
	    	case 4:
	    		System.out.println("Display student descending on marks : ");
	    		Arrays.sort(student, new Comparator<Student>()
	    				{

							@Override
							public int compare(Student o1, Student o2) {
								// TODO Auto-generated method stub
								return Double.compare(o2.getMarks(), o1.getMarks());
							}
	    			
	    				});
	    		for(Student stu : student)
	    			System.out.println(stu);
	    		break;
	    	case 5:
	    		System.out.println("student sorted on course : ");
	    		Arrays.sort(student, new Comparator<Student>()
	    				{

							@Override
							public int compare(Student o1, Student o2) {
								// TODO Auto-generated method stub
								return o1.getCourse().compareTo(o2.getCourse());
								
							}
	    			       
	    				});
	    		for(Student stu : student)
	    			System.out.println(stu);
	    		break;
	    	default :
	    		break;
	    	}
	    	if(choice == 0) {
	    		break;
	    	}
	    }
		System.out.println("Thank you !!!!");
		
	}

}
