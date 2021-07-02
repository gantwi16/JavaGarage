package com.qa.garage;

import com.qa.garage.structure.Garage;
import com.qa.garage.vehicles.Bike;
import com.qa.garage.vehicles.Car;
import com.qa.garage.vehicles.Motorbike;
import com.qa.garage.vehicles.Vehicle;

public class Runner {

	public static void main(String[] args) {
//		garageScript();
		Garage myGarage = new Garage();
		myGarage.storeVehicle(new Bike());
		myGarage.storeVehicle(new Car());
		myGarage.storeVehicle(new Motorbike());
		System.out.println("View garage 1");
		myGarage.viewVehicles();
		
		Garage myGarage2 = new Garage();
		myGarage2.storeVehicle(new Bike());
		myGarage2.storeVehicle(new Car());
		myGarage2.storeVehicle(new Motorbike());
		System.out.println("\nView garage 2");
		myGarage2.viewVehicles();
	}
	

	public static void polymorphTest() {
		Vehicle vehicle = new Vehicle();
		Car car = new Car();
		Bike bike = new Bike();
		Motorbike motorbike = new Motorbike();
		
		if (vehicle instanceof Object) {
			System.out.println("Vehicle is-a instance of Object");
		}
		
		if (car instanceof Vehicle) {
			System.out.println("Car is-a instance of Vehicle");
		}
		
		if (bike instanceof Vehicle) {
			System.out.println("Bike is-a instance of Vehicle");
		}
		
		if (motorbike instanceof Bike) {
			System.out.println("Motorbike is-a instance of Bike");
		}
		
		if (motorbike instanceof Vehicle) {
			System.out.println("Motorbike is-a instance of Vehicle");
		}
	}
	
	public static void garageScript() {
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
	
}
