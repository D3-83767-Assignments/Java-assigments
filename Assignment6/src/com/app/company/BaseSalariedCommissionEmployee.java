package com.app.company;

public class BaseSalariedCommissionEmployee extends SalariedEmployee {
    double base_salary;
    double bonus;
    double total_salary;
   // double totalSalary;
    void calculateBonus() {
       bonus = base_salary * 0.1;
    }
   
    
    void getTotalSalary() {
       total_salary =  base_salary + bonus;
    }
  
    
	public BaseSalariedCommissionEmployee(String firstName, String lastName, double base_salary) {
		super(firstName, lastName, base_salary);
		// TODO Auto-generated constructor stub
		this.base_salary = base_salary;
		calculateBonus();
		getTotalSalary();
	}
	
	
	public double getBase_salary() {
		return base_salary;
	}


	public double getBonus() {
		return bonus;
	}


	public void setTotalSalary(double totalSalary) {
		this.total_salary = totalSalary;
	}


	@Override
	public String toString() {
		return "BaseSalariedCommissionEmployee [totalSalary=" + total_salary + ", bonus=" + bonus + ", weeklySalary="
				+ weeklySalary + ", firstName=" + firstName + ", LastName=" + LastName + "]";
	}
	
	
    
}
