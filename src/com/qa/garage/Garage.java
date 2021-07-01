package com.qa.garage;
import java.util.ArrayList;
//Garage should have methods that add a Vehicle, 
//remove a Vehicle by its ID or its type, fix a Vehicle 
//(which calculates the bill) and to empty the Garage.
import java.util.List;

	public class Garage {
		public static void main(String[] args) {
			Vehicle vehicle1 = new Vehicle();
			vehicle1.setVehicleType("Car");
			vehicle1.setVehicleSize("5 Seater");
			vehicle1.setVehicleColour("Blue");
			vehicle1.setVehicleAge(10);
			System.out.println(vehicle1.getVehicleType());
			System.out.println(vehicle1.getVehicleAge());
			System.out.println(vehicle1.getVehicleColour());
			System.out.println(vehicle1.getVehicleSize());
			
			Car car1 = new Car();
			car1.setCarAge(6);
			car1.setCarMake("Vauxhall");
			car1.setCarModel("Corsa");
			car1.setCarPrice(6000);
			car1.setCarColour("Yellow");
			System.out.println(car1.getCarAge());
			System.out.println(car1.getCarMake());
			System.out.println(car1.getCarModel());
			System.out.println(car1.getCarPrice());
			System.out.println(car1.getCarColour());
			
			Bike bike1 = new Bike();
			bike1.setBikeAge(8);
			bike1.setBikeColour("Black");
			bike1.setBikePrice(159.99);
			bike1.setBikeType("BMX");
			System.out.println(bike1.getBikeAge());
			System.out.println(bike1.getBikeColour());
			System.out.println(bike1.getBikePrice());
			System.out.println(bike1.getBikeType());
			
			Motorbike motorbike1 = new Motorbike();
			motorbike1.setMotorbikeAge(3);
			motorbike1.setMotorbikeColour("Green and Black");
			motorbike1.setMotorbikeModel("Harley");
			motorbike1.setMotorbikePrice(14578.99);
			System.out.println(motorbike1.getMotorbikeAge());
			System.out.println(motorbike1.getMotorbikeColour());
			System.out.println(motorbike1.getMotorbikeModel());
			System.out.println(motorbike1.getMotorbikePrice());
		}
		
		List<Vehicle> vehicles;
//		vehicles = new ArrayList<Vehicle>();
//		vehicles.add(car1);
//		vehicles.add(vehicle1);
//		vehicles.add(bike1);
//		vehicles.add(motorbike1);
//		for (Vehicle a : vehicles) {
//			System.out.println(a);
//		}
//		
		public List<Vehicle> getVehicle() {
			return vehicles;
		}

		public void setVehicle(List<Vehicle> vehicles) {
			this.vehicles = vehicles;
		}
		
		public void removeVehicle() {
			
		}
		
		public void addVehicle(Vehicle vehicles) {
			this.vehicles.add(vehicles);
		}

		public void fixVehicle() {
			
		}
		
		public void emptyVehicle() {
			
		}
}
