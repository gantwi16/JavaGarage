package com.qa.garage;

// Car is-a Vehicle
public class Car extends Vehicle {
	private String carMake;
	private String carModel;
	private String carColour;
	private int carAge;
	private double carPrice;
	
	public Car() {
		
	}
	
	public Car(String carMake, String carModel, int carAge, double carPrice) {
		this.carAge = carAge;
		this.carMake = carMake;
		this.carModel = carModel;
		this.carPrice = carPrice;
		this.carColour = carColour;
	}
	
	public String getCarMake() {
		return carMake;
	}
	public void setCarMake(String carMake) {
		this.carMake = carMake;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public int getCarAge() {
		return carAge;
	}
	public void setCarAge(int carAge) {
		this.carAge = carAge;
	}
	public double getCarPrice() {
		return carPrice;
	}
	public void setCarPrice(double carPrice) {
		this.carPrice = carPrice;
	}

	public String getCarColour() {
		return carColour;
	}

	public void setCarColour(String carColour) {
		this.carColour = carColour;
	}
}
