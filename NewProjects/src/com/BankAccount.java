package com;

public class BankAccount {
	public static void main(String[] args) {
		BankAccount obj = new BankAccount();
      
        obj.checkApprovedCustomer();
        obj.checkCustomer();
    }

    void checkApprovedCustomer() {
     
        
        int age = 18;
        boolean Aadhaar = true;
        boolean panCard = true;
        
        System.out.println("Age: " + age);
        System.out.println("Aadhaar Available: " + Aadhaar);
        System.out.println("PAN Available: " + panCard);
        
       
        if (age >= 18 && Aadhaar && panCard) {
            System.out.println("account Opened ");
        } else {
            System.out.println("Account Opening Failed ");
        }
        System.out.println();
    }

    void checkCustomer() {
     
        
        int age = 19;
        boolean Aadhaar = true;
        boolean panCard = false; 
        
        System.out.println("Age: " + age);
        System.out.println("Aadhaar Available: " + Aadhaar);
        System.out.println("PAN Available: " + panCard);
        
       
        if (age >= 18 && Aadhaar && panCard) {
            System.out.println("Account Opened ");
        } else {
            System.out.println(" Account Opening Failed");
        }
 
    }

	}


