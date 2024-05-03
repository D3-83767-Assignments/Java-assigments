import java.util.Arrays;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student[] arr = {
				new Student(4,"Anil",60),
				new Student(2,"Mukesh",30),
				new Student(5, "Sham",50),
				new Student(1,"Nikhil", 90),
				new Student(3, "Akash",70) };
	
		System.out.println("Before sorting --> ");
		for (Student student : arr)
			System.out.println(student);
		
		Arrays.sort(arr);
		
		System.out.println("After sorting --> ");
		for (Student student : arr)
			System.out.println(student);
		
		//Comparable<Student> c1 = new Student(); 

	}

}
