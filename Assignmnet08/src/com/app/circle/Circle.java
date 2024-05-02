package com.app.circle;

import com.app.exception.UserDefinedException;

public class Circle {
    int diameter;
    Point2d p;
    
	public Circle() {
		super();
		this.diameter = 100;
		p =new Point2d(0,0);
	}

	public int getDiameter() {
		return diameter;
	}

	public void setDiameter(int diameter) throws UserDefinedException  {
		if(diameter < 0) {
			throw new UserDefinedException("diameter cannot be negative");
		}
		else {
		this.diameter = diameter;
		}
	}

    
}
