package com.app.company;

public class CommissionEmployee extends Employee {
   int grossSales;
   double commissionRate;
   double totalSal;
   
   double totalSal() {
      return grossSales * commissionRate;
   
   }





@Override
public String toString() {
	return "CommissionEmployee [grossSales=" + grossSales + ", commissionRate=" + commissionRate + ", totalSal="
			+ totalSal + ", firstName=" + firstName + ", LastName=" + LastName + "]";
}





public CommissionEmployee(String firstName, String lastName, int grossSales, double commissionRate) {
	super(firstName, lastName);
	this.grossSales = grossSales;
	this.commissionRate = commissionRate;
	totalSal = totalSal();
}
   
   
}
