package com.app.tester;

import java.util.Scanner;

import com.app.company.BaseSalariedCommissionEmployee;
import com.app.company.CommissionEmployee;
import com.app.company.Employee;
import com.app.company.HourlyEmployee;
import com.app.company.SalariedEmployee;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		
//		BaseSalariedCommissionEmployee b = new BaseSalariedCommissionEmployee("f", "l", 2000);
//		double c = b.getBonus();
//		System.out.println(c);

		System.out.println("Enter no. of employees you want to store :");
		Employee[] emp = new Employee[sc.nextInt()];

		int count = 0;

		while (true) {
			System.out.println("Enter for which employee employee calculation needs to be done :\n" + "0.exit\n"
					+ "1.for salaried employee\n" + "2.for hourly employee\n" + "3.for commission employee\n"
					+ "4.for base-salaried commission employee\n");

			int choice = 0;
			choice = sc.nextInt();

			switch (choice) {
			case 0:
				break;
			case 1:
				if(count < emp.length) {
					System.out.println("Enter Fname, Lname, weeklysalary");
					String Fname=sc.next();
					String Lname = sc.next();
					double weeklysalary = sc.nextDouble();
					emp[count++] = new SalariedEmployee(Fname, Lname,weeklysalary); 
				}
				else {
					System.out.println("employee array is full");
				}
				break;
			case 2:
				if(count < emp.length) {
					System.out.println("Enter Fname, Lname, wage, hours");
					String Fname=sc.next();
					String Lname = sc.next();
					int wage = sc.nextInt();
					int hours = sc.nextInt();
					emp[count++] = new HourlyEmployee(Fname, Lname, wage, hours); 
				}
				else {
					System.out.println("employee array is full");
				}
				break;
			case 3:
				if(count < emp.length) {
					System.out.println("Enter Fname, Lname, grosssales, comissionrate");
					String Fname=sc.next();
					String Lname = sc.next();
					int grosssales = sc.nextInt();
					double commissionRate = sc.nextDouble();
					//double weeklysalary = sc.nextDouble();
					emp[count++] = new CommissionEmployee(Fname, Lname, grosssales, commissionRate); 
				}
				else {
					System.out.println("employee array is full");
				}
				break;
			case 4:
				if(count < emp.length) {
					System.out.println("Enter Fname, Lname, base_salary");
					String Fname=sc.next();
					String Lname = sc.next();
					double base_salary = sc.nextDouble();
					emp[count++] = new BaseSalariedCommissionEmployee(Fname, Lname, base_salary);
					
				}
				else {
					System.out.println("employee array is full");
				}
				break;
			case 5:
				if(count < emp.length) {
					String Fname=sc.next();
					String Lname = sc.next();
					double weeklysalary = sc.nextDouble();
					emp[count++] = new SalariedEmployee(Fname, Lname,weeklysalary); 
				}
				else {
					System.out.println("employee array is full");
				}
				break;
			}
			if(choice == 0 ) {
				break;
			}
		}
       System.out.println("Thank you !!!!");
       System.out.println("Printing all employee details : ");
       
       for(Employee element : emp) {
    	   System.out.println(element);
       }
	}

}
