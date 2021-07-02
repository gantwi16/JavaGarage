package com.qa.garage.vehicles;

// Motorbike is-a Bike, Bike is-a Vehicle, Vehicle is-a Object
public class Motorbike extends Bike {

	private String motorbikeModel;
	private String motorbikeColour;
	private int motorbikeAge;
	private double motorbikePrice;
	
	public Motorbike() {
		
	}
	
	public Motorbike(String motorbikeModel, String motorbikeColour, int motorbikeAge, double motorbikePrice) {
		this.motorbikeAge = motorbikeAge;
		this.motorbikeColour = motorbikeColour;
		this.motorbikeModel = motorbikeModel;
		this.motorbikePrice = motorbikePrice;
	}
	
	public String getMotorbikeModel() {
		return motorbikeModel;
	}
	public void setMotorbikeModel(String motorbikeModel) {
		this.motorbikeModel = motorbikeModel;
	}
	public String getMotorbikeColour() {
		return motorbikeColour;
	}
	public void setMotorbikeColour(String motorbikeColour) {
		this.motorbikeColour = motorbikeColour;
	}
	public int getMotorbikeAge() {
		return motorbikeAge;
	}
	public void setMotorbikeAge(int motorbikeAge) {
		this.motorbikeAge = motorbikeAge;
	}

	public double getMotorbikePrice() {
		return motorbikePrice;
	}

	public void setMotorbikePrice(double motorbikePrice) {
		this.motorbikePrice = motorbikePrice;
	}
	
}
