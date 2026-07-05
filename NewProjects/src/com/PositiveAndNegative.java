package com;

public class PositiveAndNegative {
public static void main(String[] args) {
	PositiveAndNegative obj = new PositiveAndNegative();
	obj.checkNumber();
}
void checkNumber() {
	int number = -10;
	
	if (number >0) {
		System.out.println("it is the positive number ");
		
	}else if (number < 0) {
		System.out.println("it is the negative number ");
		
	}else {
		System.out.println("the number is zero ");
		
	}
}
}
