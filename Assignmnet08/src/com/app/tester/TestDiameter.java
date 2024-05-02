package com.app.tester;

import java.util.Scanner;

import com.app.circle.Circle;
import com.app.exception.UserDefinedException;

public class TestDiameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int diameter;
		
		Circle c = new Circle();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter diameter of a circle :");
		diameter = sc.nextInt();
		try {
		c.setDiameter(diameter);
		}
		
		catch(UserDefinedException e){
			e.printStackTrace();
		}

	}

}
