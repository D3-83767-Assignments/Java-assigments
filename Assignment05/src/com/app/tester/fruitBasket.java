package com.app.tester;

import java.util.Scanner;

import com.app.fruits.Apple;
import com.app.fruits.Fruit;
import com.app.fruits.Mango;
import com.app.fruits.Orange;

public class fruitBasket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Basket size : ");
        Fruit[] basket = new Fruit[sc.nextInt()];
        
        int counter = 0;
        
        while(true){
        	System.out.println("Enter choice : ");
        	System.out.println("0. Exit\r\n"
        			+ "1. Add Mango\r\n"
        			+ "2. Add Orange\r\n"
        			+ "3. Add Apple\r\n"
        			+ "4. Display names of all fruits in the basket\r\n"
        			+"5. Display name,color,weight , taste of all fresh fruits , in the basket.\r\n"
        			+"6. Mark a fruit as stale\r\n"
        			+"7. Display tastes of all stale(not fresh) fruits in the basket.\r\n"
        			+"8. Mark all sour fruits stale (optional)\r\n");
           int choice = sc.nextInt();
           
           
           
           System.out.println(choice);
          
           
           switch(choice) {
             case 0 :
            	 break;
        	  
             case 1 :
            	// System.out.println("dfgh");
            	// System.out.println(basket.length);
            	 if(counter <= basket.length) {
            		 System.out.println("Enter color, weight, name of Mango");
            		 String color;
            		 color = sc.next();
            		 double weight;
            		 weight = sc.nextDouble();
            		 String name;
            		 name = sc.next();
            		 basket[counter++] = new Mango(color, weight, name);
            		 
            	 }
            	 else {
            		 System.out.println("Basket is full : ");
            	 }
            	 
          	   break;
          	   
             case 2 :
            	 
            	 if(counter < basket.length) {
            		 System.out.println("Enter color, weight, name of Orange");
            		 String color;
            		 color = sc.next();
            		 double weight;
            		 weight = sc.nextDouble();
            		 String name;
            		 name = sc.next();
            		 basket[counter++] = new Orange(color, weight, name);
            	 }
            	 else {
            		 System.out.println("Basket is full : ");
            	 }
            	 
          	   break;
             
             case 3 :
            	 
            	 if(counter < basket.length) {
            		 System.out.println("Enter color, weight, name of Apple");
            		 String color;
            		 color = sc.next();
            		 double weight;
            		 weight = sc.nextDouble();
            		 String name;
            		 name = sc.next();
            		 basket[counter++] = new Apple(color, weight, name);
            	 }
            	 else {
            		 System.out.println("Basket is full : ");
            	 }
            	 
          	   break;
          	   
             case 4 :
            	 System.out.println("Printing all name of fruits in a basket : ");
            	 for( Fruit element:basket) {
            		 if(element != null) {
            			// System.out.println(fruit.getName());
            		 System.out.println("Name of a fruit : " + element.getName());
            		 }
            	 }
            	   break;
            
             case 5 :
            	 System.out.println("Printing fruits details in a basket : ");
            	 for( Fruit element:basket) {
            		 if(element != null) {
            			// System.out.println(fruit.getName());
            		 System.out.println("Name of a fruit : " + element.toString());
            		 }
            	 }
            	   break;
            	  
             case 6 :
            	 System.out.println("Enter index of fruit to mark as stale");
            	 int index = sc.nextInt();
            	 if(index >= 0 && index < basket.length  || basket[index]!=null) {
            		 System.out.println("inside if");
            		 basket[index].setisFresh(false);
            	 }
            	 else {
            		 System.out.println("invalid index");
            	 }
            	   break;
            	   
             case 7 :
            	 System.out.println("Displaying taste of all stale fruits : ");
            	 
            	 for(Fruit  element : basket) {
            		 if(element != null && !element.getisFresh()) {
                		 System.out.println(element.taste());
                	 } 
            	 }
            	 
            	   break;
            	   
             case 8 :
            	 
            	 for(Fruit element:basket) {
            		 if(element != null && (element.taste()).equals("sour") ) {
            			 element.setisFresh(false);
            		 }
            	 }
            	 
            	   break;
              
              default :
            	  System.out.println("invalid option");
            	 break;
            	   
           }
           if(choice == 0) {
        	   break;
           }
        }
       
        System.out.println("Thank you");
	}

}
