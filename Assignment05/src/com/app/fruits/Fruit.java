package com.app.fruits;

public class Fruit {
	//class fields
   String color;
   double weight;
   String name;
   boolean isFresh = true;
   //default constructor
public Fruit() {
	super();
}
//parameterized constructor 
public Fruit(String color, double weight, String name) {
	super();
	this.color = color;
	this.weight = weight;
	this.name = name;
}

//getter setters
public String getName() {
	return name;
}
public boolean getisFresh() {
	// TODO Auto-generated method stub
	return isFresh;
}
public void setisFresh(boolean b) {
	// TODO Auto-generated method stub
	isFresh = b;
}


@Override
public String toString() {
	return "Fruit [color=" + color + ", weight=" + weight + ", name=" + name + "]";
}

//facillitators
//taste method
public String taste(){
	   return "no specific taste";
}

}
//Q1 Apply inheritance n polymorphism
//a) Arrange Fruit,Apple,Orange,Mango in inheritance hierarchy
//b) Properties (instance variables) : color : String , weight : double , name:String, isFresh : boolean
//c) Add suitable constructors.
//d) Override toString correctly to return state of all fruits (including : name ,color , weight )
//e) Add a taste() method : public String taste()