package com;

public class CollageAdmission {
	public static void main(String[] args) {
		CollageAdmission obj = new CollageAdmission();
        
       
        obj.processTopStudent();
        obj.processRegularStudent();
        obj.processMissingDocsStudent();
    }

    void processTopStudent() {
     
        
        double marks = 95.0;
        boolean docsSubmitted = true;
        
        System.out.println("Marks: " + marks);
        System.out.println("Documents Submitted " + docsSubmitted);
        
        if (marks >= 60.0 && docsSubmitted) {
            System.out.println("Admission Status GRANTED");
            
            if (marks > 90.0) {
                System.out.println("Scholarship eligible Scored above 90%");
            } else {
                System.out.println("Not Eligible.");
            }
            
        } else {
            System.out.println("admission REJECTED");
        }
       
    }

    void processRegularStudent() {
       
        
        double marks = 75.0;
        boolean docsSubmitted = true;
        
        System.out.println("Marks " + marks );
        System.out.println("Documents Submitted: " + docsSubmitted);
        
        if (marks >= 60.0 && docsSubmitted) {
            System.out.println("Admission Status GRANTED");
            
            if (marks > 90.0) {
                System.out.println("Scholarship Status eligible eligible Scored above 90%");
            } else {
                System.out.println(" Not Eligible");
            }
            
        } else {
            System.out.println(" REJECTED");
        }
      
    }

    void processMissingDocsStudent() {
      
        
        double marks = 85.0; 
        boolean docsSubmitted = false; 
        
        System.out.println("Marks: " + marks + "%");
        System.out.println("Documents Submitted: " + docsSubmitted);
        
        if (marks >= 60.0 && docsSubmitted) {
            System.out.println("Admission Status GRANTED");
            
            if (marks > 90.0) {
                System.out.println("Scholarship Status eligible Scored above 90%");
            } else {
                System.out.println(" Not Eligible");
            }
            
        } else {
            
            System.out.println(" REJECTED ");
        }
	}

}
