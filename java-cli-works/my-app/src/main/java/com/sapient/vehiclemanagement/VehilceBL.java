package com.sapient.vehiclemanagement;

// 100% cohesive until it any type of vehicle
// class is the abstraction for the client 
// which handles all the complexities 
public class VehilceBL {

	// a good practice not to pass class rather 
	// it should be interface 
	public static  void showVehicleDetails(Vehicle vehicle) {
		System.out.println("-----------------------------------------");
		vehicle.nuts();
		vehicle.move();
		if(vehicle instanceof Car) {
			((Car) vehicle).isPowerSteering(true);
		}else if(vehicle instanceof TwoWheeler) {
			((TwoWheeler) vehicle).selfStart(false);
		}
	}
	
}
