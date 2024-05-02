package com.app.question1;

import java.util.Scanner;

class ExceptionLineTooLong extends Exception {
    public ExceptionLineTooLong(String message) {
        super(message);
    }
}

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner scanner = new Scanner(System.in);
		        
		        try {
		            System.out.print("Enter a string: ");
		            String userInput = scanner.nextLine();
		            
		            if (userInput.length() > 80) {
		                throw new ExceptionLineTooLong("The string is too long");
		            } else {
		                System.out.println("String length is: " + userInput.length());
		            }
		        } catch (ExceptionLineTooLong e) {
		            System.out.println("Error: " + e.getMessage());
		        }
		    }
	

}
