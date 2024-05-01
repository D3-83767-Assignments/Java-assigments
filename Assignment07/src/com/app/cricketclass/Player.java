package com.app.cricketclass;

import java.util.Scanner;

public abstract class Player {
    int id;
    String name;
    int age;
    int mathchesPlayed;
    int count =0;
    
	public Player(int id, String name, int age, int mathchesPlayed) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.mathchesPlayed = mathchesPlayed;
	}
	
	public int getMathchesPlayed() {
		return mathchesPlayed;
	}


	@Override
	public String toString() {
		return "Player [name=" + name + ", mathchesPlayed=" + mathchesPlayed + "]";
	}



	public abstract void accept(Scanner sc);
    
    
}
