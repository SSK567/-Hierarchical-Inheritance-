package com;

public class NewAssignment {
	public static void main(String[] args) {
		 NewAssignment obj = new  NewAssignment();
        
       
        obj.calculateIntegers();
        obj.calculateDecimals();
        obj.calculateCharacters();
        obj.calculateExamPercentage();
        obj.calculateDiscount();
    }

    void calculateIntegers() {

        byte a = 10;
        short b = 50;
        int c = 100;
        long d = 500L;

        int sum = a + b + c; 
        
      
        System.out.println("Is sum greater than d " + (sum > d));
        System.out.println("Is c less than or equal to 100 " + (c <= 100));
       
    }

    void calculateDecimals() {
      
        float S = 15.5f;
        double F = 31.0;

        double multiplication = S * 2; 
        
        System.out.println(" multiplication equal Double " + (multiplication == F ));
        System.out.println("Is Float not equal to Double " + (S != F));
       
    }

 

    void calculateCharacters() {
       
        char letterA = 'A'; 
        char letterB = 'B'; 

        System.out.println("Is 'A' less than 'B' " + (letterA < letterB));
    }
    
    
    
    void calculateExamPercentage() {
        
        double totalMarks = 500.0;
        double marksObtained = 410.0;
        
    
        double percentage = (marksObtained / totalMarks) * 100;
        boolean isPass = percentage >= 35.0;
        
        System.out.println("Marks Obtained is " + marksObtained + " out of " + totalMarks);
        System.out.println("Final Percentage is " + percentage );
  
        
        System.out.println(" the student pass " + isPass);
       
    }

    void calculateDiscount() {
       
        
        double originalPrice = 1200.0;
        double discountPercentage = 15.0;
        
        
        double discountAmount = originalPrice * (discountPercentage / 100);
        
        double finalPrice = originalPrice - discountAmount;
        
        System.out.println("Original Price is " + originalPrice);
        System.out.println("Discount Applied  " + discountPercentage);
        System.out.println("Amount Saved is " + discountAmount);
        System.out.println("Final Price to Pay  " + finalPrice);
        
       
        System.out.println("Is the final price under 1000 " + (finalPrice < 1000.0));
       
    }
    
    
    
	}




