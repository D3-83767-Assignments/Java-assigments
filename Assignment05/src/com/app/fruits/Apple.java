package com.app.fruits;

public class Apple extends Fruit {

	public Apple() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Apple(String color, double weight, String name) {
		super(color, weight, name);
		// TODO Auto-generated constructor stub
	}
 
   @Override
public String taste() {
	// TODO Auto-generated method stub
	return "sweet n sour";
}
   
}
