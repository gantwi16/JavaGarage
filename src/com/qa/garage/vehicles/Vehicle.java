package com.qa.garage.vehicles;

public class Vehicle {
	
		private String vehicleType;
		private String vehicleSize;
		private String vehicleColour;
		private int vehicleAge;
		
		public Vehicle() {
			
		}
		
		public Vehicle(String vehicleType, String vehicleSize, String vehicleColour, int vehicleAge) {
			this.vehicleAge = vehicleAge;
			this.vehicleColour = vehicleColour;
			this.vehicleSize = vehicleSize;
			this.vehicleType = vehicleType;
		}
		
		public double cost() {
			if (vehicleAge == 4) {
				return vehicleAge * 1000;
			} else  {
				return vehicleAge * 100;
			}
		}
		
		public String getVehicleType() {
			return vehicleType;
		}
		public void setVehicleType(String vehicleType) {
			this.vehicleType = vehicleType;
		}
		public String getVehicleSize() {
			return vehicleSize;
		}
		public void setVehicleSize(String vehicleSize) {
			this.vehicleSize = vehicleSize;
		}
		public String getVehicleColour() {
			return vehicleColour;
		}
		public void setVehicleColour(String vehicleColour) {
			this.vehicleColour = vehicleColour;
		}
		public int getVehicleAge() {
			return vehicleAge;
		}
		public void setVehicleAge(int vehicleAge) {
			this.vehicleAge = vehicleAge;
		}
		
}
