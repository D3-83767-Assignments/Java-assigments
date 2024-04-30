package com.app.company;

public class HourlyEmployee extends Employee {
   int wage;
   int hrs;
   double totalSalary ;
   
   void calculateSalary() {
   if(hrs > 40) {
		totalSalary = wage * hrs * 1.5;
	}
	else {
		totalSalary = wage * hrs;
	}
     
   } 
  // double sal = calculateSalary();
   //totalSalary = wage * hrs;
   
//public HourlyEmployee(String firstName, String lastName, int wage, int hrs) {
//	super(firstName, lastName);
//	this.wage = wage;
//	this.hrs = hrs;
//}
public HourlyEmployee(String firstName, String lastName, int wage, int hrs) {
	super(firstName, lastName);
	this.wage = wage;
	this.hrs = hrs;
	//this.sal = sal;
	calculateSalary();
}
@Override
public String toString() {
	return "HourlyEmployee [wage=" + wage + ", hrs=" + hrs + ", total sal=" + totalSalary + "]";
}






   
}
