package com;

public class HotelBills {
	public static void main(String[] args) { 
		HotelBills obj = new HotelBills();
		obj.hotelRoombill();
		
	}
		
void hotelRoombill() {
	
	int roomRate = 4;
	double priceparDay = 2000.0;
	
	double totalRoomCost = roomRate * priceparDay ;
	System.out.println("room rate is " + roomRate );
	System.out.println("price par day "+ priceparDay);
	System.out.println("Total room cost is "+ totalRoomCost);
		
	}


}
