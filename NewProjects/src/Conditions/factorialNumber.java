package Conditions;

public class factorialNumber {
public static void main(String[] args) {
	int num = 5; 
    long factorial = 1;
    int i = num;

    while (i >= 1) {
        factorial *= i; 
        i--;           
    }

    System.out.println("Factorial of " + num + " is: " + factorial);
}
}

