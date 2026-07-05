package com;

public class ParkingFees {
	public static void main(String[] args) {
	ParkingFees	obj = new  ParkingFees();
	obj.calculateCarParking();
	}
	void calculateCarParking() {
       
        String vehicleType = "Car";
        int hoursParked = 4;
        int ratePerHour = 0;
        
        if (vehicleType.equals("Bike")) {
            ratePerHour = 20;
        } else if (vehicleType.equals("Car")) {
            ratePerHour = 50;
        } else if (vehicleType.equals("Bus")) {
            ratePerHour = 100;
        } else {
            System.out.println("Error");
        }
        
       
        int totalFee = ratePerHour * hoursParked;
        
        System.out.println("Vehicle Type  " + vehicleType);
        System.out.println("Hours Parked  " + hoursParked );
        System.out.println("Rate applied  " + ratePerHour );
        System.out.println("Total Parking Fee  " + totalFee);
       
    }
}
