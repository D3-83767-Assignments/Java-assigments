package tester;

import java.util.Scanner;

import com.app.geometry.Point2d;

public class TestPointArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int noOfPoints;
		int index;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of points : ");
		// noOfPoints = sc.nextInt();
		Point2d[] points = new Point2d[sc.nextInt()];

		for (int i = 0; i < points.length; i++) {
			int x;
			int y;
			System.out.println("Enter x, y co - ordinate");
			x = sc.nextInt();
			y = sc.nextInt();
			points[i] = new Point2d(x, y);
		}

		while (true) {
			System.out.println("Enter your choice : " + "1.Display details of specific point : "
					+ " 2. Display x, y co-ordinates of all points "
					+ " 3.User i/p : 2 indices for the points , validate the indices " + " 4.Exit");
			int choice;
			choice = sc.nextInt();
			
			switch(choice) {
			 case 1:
				System.out.println("Enter index :");
				index = sc.nextInt();
				if(index > 0 && index < points.length) {
				   // points[index].getDetails();
				    System.out.println("Co- ordinates of point are : "+ points[index].getDetails());
				}
				else {
					System.out.println("Invalid index plz retry !!!");
				}
				break;
			 case 2 :
				 System.out.println("Displaying x, y co-ordinates of all points");
				 
				 for(Point2d ref:points) {
					 System.out.println("Co- ordinates of point are : "+ ref.getDetails());
					 
					 System.out.println("-------------------------------------");
				 }
				 break;
			 case 3 :
				 int index1;
				 int index2;
				 System.out.println("Enter index of start point and end point");
				 index1 = sc.nextInt();
				 index2 = sc.nextInt();
				 if((index1 >= 0 && index1 < points.length) && (index2 >= 0 && index2 < points.length)) {
					 //System.out.println("Invalid index entered please try again");
					// System.out.println("inside if");
					 if(points[index1].equals(points[index2])) {
						 System.out.println("same points entered");
						 
					 }
					 else {
						 System.out.println("Distance between 2 points : " + points[index1].distance(points[index2]));
						// points[index1].distance(points[index2]);
					 }
				 }
				 else {
					 System.out.println("invalid index entered plz enter valid index");
				 }
			 break;
				 
			 case 4:
				 break;
				 
			 default :
				 System.out.println("invalid choice entered :");
				 break;
			}
			if(choice == 4) {
				break;
			}
		}
     System.out.println("Thank you !!!!!");
	}

}
