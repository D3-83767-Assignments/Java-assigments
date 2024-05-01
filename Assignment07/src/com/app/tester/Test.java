package com.app.tester;

import java.util.Scanner;

import com.app.cricketclass.Cricketer;
import com.app.cricketclass.Player;


public class Test {
    static int menu(Scanner sc) {
    	
    	System.out.println("Enter choice : \n"+
    "0.exit\n"+
    "1.Enter players\n"+
    "2.shows count of number of total runs of all players, wickets taken by all player and\n "
    + "total no. of matches played\n "+
    "3.display cricketers with their name and no of matches played\n");
       return sc.nextInt();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Player [] player =new Player[3];
         Scanner sc = new Scanner(System.in);
         int count =1;
         while(true) {
        	int choice = menu(sc);
        	switch(choice) {
        	case 0:
        		break;
        	case 1:
        		for(int i =0; i<player.length; i++) {
        			System.out.println("Enter details for player : "+i+" :");
        			//System.out.println("Enter id : ");
        			int id = count++;
        			System.out.println("Enter name : ");
        			String name = sc.next();
        			System.out.println("Enter age : ");
        			int age = sc.nextInt();
        			System.out.println("Enter matchesPlayed : ");
        			int matchesPlayed = sc.nextInt();
        			System.out.println("Enter wickets : ");
        			int wickets = sc.nextInt();
        			System.out.println("Enter runs : ");
        			int runs = sc.nextInt();
        			player[i] = new Cricketer(id, name, age, matchesPlayed, wickets, runs);
        		}
        		break;
        	case 2:
        		System.out.println("displaying total runs :\n");
        		int totalRun = 0;
        		int totalWickets = 0;
        		int matchesPlayed = 0;
        		for(Player element:player) {
        			matchesPlayed += element.getMathchesPlayed();
        			Cricketer e = (Cricketer)element;
        			totalWickets += e.getWickets();
        			totalRun += e.getRuns();
        		}
        		System.out.println("Total Run : "+totalRun+"Total Wickets : "+totalWickets+"Total matches played : "+matchesPlayed);
        		break;
//        	case 3:
//        		System.out.println("displaying total wickets :");
//        		int totalWicket = 0;
//        		for(Player element:player) {
//        			Cricketer e = (Cricketer)element;
//        			totalWicket += e.getWickets();
//        		}
//        		System.out.println("Total wickets"
//        				+ ""
//        				+ ""
//        				+ " :"+ totalWicket);
//        		break;
        	case 3:
        		System.out.println("Displaying cricketer name and no of matched played : ");
        		for(Player element:player) {
        			System.out.println(element);
        		}
        		break;
        	
        	default:
        		break;
        	}
        	if(choice == 0) {
        		break;
        	}
         }

	}

}
