package com;

public class KmAverage {
	public static void main(String[] args) {
		KmAverage obj = new KmAverage ();
		obj.calculateMileage();
		obj.calculatePrice();
		
	}
		
		
		void calculateMileage () {
			double startingKm = 10.5;
			double endKm = 28.5;
			double fuelUsed = 15.00;
			 
			double distance = endKm - startingKm ;
			double averageKm = distance / fuelUsed;
			
			System.out.println("distance travel "+ distance );
			System.out.println("fuel used is  "+ fuelUsed);
			System.out.println("cars average is "+ averageKm);
				
		
	}
		
		void calculatePrice () {
			
			double distance = 400;
			double totalAverage = 20 ;
			double fuelprice = 107;
		 
			double requiredFuel = distance /totalAverage ;
			double estimateFuelcost = requiredFuel * fuelprice ;
			
			System.out.println("total distance is  "+ distance );
			System.out.println ("fuel required is "+ requiredFuel);
			System.out.println("total fuel cost is "+ estimateFuelcost);
			
			
			
		}
	

}
