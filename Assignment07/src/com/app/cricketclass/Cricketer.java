package com.app.cricketclass;

import java.util.Scanner;

import com.app.cricket.Batter;
import com.app.cricket.Bowler;

public class Cricketer extends Player implements Batter, Bowler {
    int wickets;
    int runs;
	
	
	public Cricketer(int id, String name, int age, int mathchesPlayed, int wickets, int runs) {
		super(id, name, age, mathchesPlayed);
		this.wickets = wickets;
		this.runs = runs;
	}
     
	@Override
	public int getWickets() {
		// TODO Auto-generated method stub
		return wickets;
	}

	@Override
	public int getRuns() {
		// TODO Auto-generated method stub
		return runs;
	}
	
	

	@Override
	public void accept(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("Enter name : ");
		name = sc.next();
		System.out.println("Enter age");
		age = sc.nextInt();
		System.out.println("Enter no. of matches played : ");
		mathchesPlayed = sc.nextInt();
		System.out.println("Enter no. of wickets taken :");
		wickets = sc.nextInt();
		System.out.println("Enter no. of run :");
		runs = sc.nextInt();
	}
    
}
