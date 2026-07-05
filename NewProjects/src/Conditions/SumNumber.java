package Conditions;

public class SumNumber {
	public static void main(String[] args) {
		int n = 10; 
        int sum = 0;
        int i = 1; 

      
        while (i <= n) {
            sum += i; 
            i++;     
        }

        System.out.println("Sum of natural numbers from 1 to " + n + " is: " + sum);
    }
	}


