package com.app.geometry;

public class Point2d {
	//local variables
	int x;
	int y;
	
	//parameterized constructors
	public Point2d(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public boolean isEqual(Point2d obj2){
		if(this.x == obj2.x && this.y == obj2.y) {
			return true;
		}
		return false;
	}
	
	public double distance(Point2d obj2) {
       
       //you cannot declare and assign a variable within the return statement 
		return /*double distance =*/   Math.sqrt(Math.pow(this.x - obj2.x, 2) + Math.pow(this.y - obj2.y, 2) );
	}
	
	public void getDetails() {
		System.out.println(" Point details :");
		System.out.println("X : "+ x);
		System.out.println("Y : "+ y);
	}

}
