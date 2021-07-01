package com.qa.garage;

public class Runner {

	public static void main(String[] args) {
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

}
