package com.qa.garage.structure;
import java.util.ArrayList;
//Garage should have methods that add a Vehicle, 
//remove a Vehicle by its ID or its type, fix a Vehicle 
//(which calculates the bill) and to empty the Garage.
import java.util.List;

import com.qa.garage.vehicles.Motorbike;
import com.qa.garage.vehicles.Vehicle;

	public class Garage {
		
		private List<Vehicle> vehicles = new ArrayList<>();
		
		public void storeVehicle(Vehicle motorvehicle) {
			this.vehicles.add(motorvehicle);
			System.out.println(motorvehicle);
		}
		
		public void viewVehicles() {
			for (Vehicle a : vehicles) {
				System.out.println(a);
			}
		}
		
		public void costVehicles() {
			for (Vehicle v : vehicles) {
				System.out.println(v);
				System.out.println("Cost " + v.cost());
			}
		}
		
		public List<Vehicle> getVehicle() {
			return vehicles;
		}

		public void setVehicle(List<Vehicle> vehicles) {
			this.vehicles = vehicles;
		}
		
		public void removeVehicle(Vehicle vehicles) {
			this.vehicles.remove(vehicles);
		}
		
		public void addVehicle(Vehicle vehicles) {
			this.vehicles.add(vehicles);
		}

		public void fixVehicle(Vehicle vehicles) {
			removeVehicle(vehicles);
			System.out.println(vehicles.cost());
		}
		
		public void emptyVehicle() {
			this.vehicles.removeAll(vehicles);
		}
}
	
//		vehicles = new ArrayList<Vehicle>();
//		vehicles.add(car1);
//		vehicles.add(vehicle1);
//		vehicles.add(bike1);
//		vehicles.add(motorbike1);
//		for (Vehicle a : vehicles) {
//			System.out.println(a);
//		}