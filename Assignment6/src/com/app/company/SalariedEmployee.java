package com.app.company;

public class SalariedEmployee extends Employee {
   double weeklySalary;

public SalariedEmployee(String firstName, String lastName, double weeklySalary) {
	super(firstName, lastName);
	this.weeklySalary = weeklySalary;
}

@Override
public String toString() {
	return "SalariedEmployee [weeklySalary=" + weeklySalary + ", firstName=" + firstName + ", LastName=" + LastName
			+ "]";
}
   
   
}
