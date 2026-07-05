package Conditions;

public class NaturalN {
	public static void main(String[] args) {
		int n = 10; 
        int sum = 0;
        int i = 1; 

       
        while (i <= n) {
         
            if (i % 2 == 0) {
                sum += i; 
            }
            i++;
        }

        System.out.println("Sum of even numbers from 1 to " + n + "  is: " + sum);
    }
	}


