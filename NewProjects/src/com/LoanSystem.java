package com;

public class LoanSystem {
	public static void main(String[] args) {
		LoanSystem obj = new LoanSystem();
        
        
        obj.checkLoan();
        obj.checkRejectedLoan();
    }

    void checkLoan() {
       
        
        double salary = 45000.0;
        int cibilScore = 780;
        int age = 35;
        
        System.out.println("Salary is " + salary);
        System.out.println("CIBIL Score is  " + cibilScore);
        System.out.println("Age is  " + age);
    
        if (salary >= 30000.0 && cibilScore >= 750 && age >= 21 && age <= 60) {
            System.out.println("Loan Approved ");
        } else {
            System.out.println("Loan Rejected  ");
        }
       
    }

    void checkRejectedLoan() {
        
        
        double salary = 25000.0; 
        int cibilScore = 800;    
        int age = 65;            
        
        System.out.println("Salary is " + salary);
        System.out.println("CIBIL Score is  " + cibilScore);
        System.out.println("Age is  " + age);
      
        if (salary >= 30000.0 && cibilScore >= 750 && age >= 21 && age <= 60) {
            System.out.println(" Loan Approved ");
        } else {
            System.out.println("Loan Rejected ");
        }
      
    
	}

}
