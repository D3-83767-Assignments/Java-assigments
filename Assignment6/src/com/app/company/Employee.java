package com.app.company;

public class Employee {
   String firstName;
   String LastName;
   static int SSN;
   

   
public Employee(String firstName, String lastName) {
	super();
	this.firstName = firstName;
	LastName = lastName;
	SSN++;
}


@Override
public String toString() {
	return "Employee [firstName=" + firstName + ", LastName=" + LastName + "]";
}





   
}
