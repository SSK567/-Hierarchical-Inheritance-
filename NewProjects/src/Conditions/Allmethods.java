package Conditions;

public class Allmethods {
	public static void main(String[] args) {
		Allmethods obj = new Allmethods ();
		//obj.printNumber();
		//obj.printevenNumber();
		obj.printoddNumber();
		obj.negativePositive();
		obj.switchcase();
		obj.even();
		obj.odd();
		obj.reverseNumber();
		obj.multiplication();
	}
		
		void printNumber () {
			
		
		int i = 10;
		while (i <=10) {
			System.out.println(i + "");
			i++;
		}	
	}

		
		void printevenNumber () {
			int i = 40;
			while ( i <= 80) {
				if (i % 2==0) {
					System.out.println(i );
					i++;
				}
			}
		}
	
		void printoddNumber () {
			
		int i = 100;
		do {
			if ( i % 2 != 0) {
				System.out.println(i );
			}
			i++;
		}while (i <= 150);
		System.out.println("\n");
			
		}
		
		void negativePositive () {
			

			int number = -15;
			
			if (number > 0) {
				System.out.println("is a positive number "+ number);
				
			}else if (number <0) {
				System.out.println("is a negative number "+ number);
				
				
			}
			else {
				System.out.println("the number is zero ");
			}
		}
    void switchcase () {
    	
     int month = 5;
      
     switch (month) {
     
     case 1 :
    	 System.out.println("Jan");
    	 break;
    	 
     case 2 :
    	 System.out.println("feb");
    	 break;
     case 3 :
    	 System.out.println("march");
    	 break;
     case 4 :
    	 System.out.println("april");
    	 break;
     case 5 :
    	 System.out.println("may");
    	 break;
     case 6 :
    	 System.out.println("june");
    	 break;
     case 7 :
    	 System.out.println("july");
    	 break;
    	 
    	 
    	 
     
     }
    	
    	
    	}
    
    
    void even () {
    	
    	for ( int i = 1; i <= 100; i++) {
    		if (i % 2 ==0) {
    			System.out.println(i + "");
    			
    		}
    	}
    	
    }
    
    void odd () {
    	
    	for (int i = 1; i <= 100; i++) {
    		if ( i % 2 != 0) {
    			System.out.println(i);
    		}
    	}
    	
    }
    
    void reverseNumber () {
    	
    	for ( int i = 100; i>=1; i--) {
    		System.out.println(i);
    	}
    }
    
    
    void multiplication () {
    	int Number = 5;
    	
    	for (int i = 1; i <= 10; i++) {
    		System.out.println(Number + "x" + i + "=" + (Number * i));
    	}
    }
    
    }

