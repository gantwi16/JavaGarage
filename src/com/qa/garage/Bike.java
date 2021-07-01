package com.qa.garage;

// Bike is-a Vehicle
public class Bike extends Vehicle {
	private String bikeType;
	private String bikeColour;
	private int bikeAge;
	private double bikePrice;
	
	public Bike() {
		
	}
	
	public Bike(String bikeType, String bikeColour, int bikeAge, double bikePrice) {
		this.bikeAge = bikeAge;
		this.bikeColour = bikeColour;
		this.bikePrice = bikePrice;
		this.bikeType = bikeType;
	}
	
	public String getBikeType() {
		return bikeType;
	}
	public void setBikeType(String bikeType) {
		this.bikeType = bikeType;
	}
	public String getBikeColour() {
		return bikeColour;
	}
	public void setBikeColour(String bikeColour) {
		this.bikeColour = bikeColour;
	}
	public int getBikeAge() {
		return bikeAge;
	}
	public void setBikeAge(int bikeAge) {
		this.bikeAge = bikeAge;
	}
	public double getBikePrice() {
		return bikePrice;
	}
	public void setBikePrice(double bikePrice) {
		this.bikePrice = bikePrice;
	}
}
