package Conditions;

public class sumoddNumber {
	public static void main(String[] args) {
		int n = 10; 
        int sum = 0;
        int i = 1; 
        while (i <= n) {
           
            if (i % 2 != 0) {
                sum += i; 
            }
            i++; 
        }

        System.out.println("Sum of odd numbers from 1 to " + n + " is " + sum);
    
	}

}
