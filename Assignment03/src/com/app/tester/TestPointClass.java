package com.app.tester;

import java.util.Scanner;

import com.app.geometry.Point2d;

public class TestPointClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		int y;
		//for obj1
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter X co-ordinate");
		x = sc.nextInt();
		System.out.println("Enter Y co-ordinate");
		y = sc.nextInt();
		
		Point2d obj1 = new Point2d(x,y);
		
	    //for obj25
		
		System.out.println("Enter X co-ordinate");
		x = sc.nextInt();
		System.out.println("Enter Y co-ordinate");
		y = sc.nextInt();
		
		Point2d obj2 = new Point2d(x,y);
		
		obj1.getDetails();
		obj2.getDetails();
		
		if(obj1.isEqual(obj2)) {
			System.out.println("Points are same");
		}
		else {
			double distance = obj1.distance(obj2);
			System.out.println("distance between 2 points : "+distance);
		}

	}

}
