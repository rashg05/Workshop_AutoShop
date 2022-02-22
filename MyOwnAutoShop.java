package com.bridgelab.autoshop;

public class MyOwnAutoShop {

	public static void main(String[] args) {
		Car car = new Car(40, 50000, "white");
		System.out.println(" Car Regular Price: " + car.getSalePrice());
		
		Truck truck = new Truck(30, 70000, "orange", 3500);
		System.out.println(" Truck Price after Discount: " + truck.getSalePrice());
		
		Ford fordCar = new Ford(40, 60000, "red", 2000, 30);
		System.out.println(" Ford Price Discount: " + fordCar.getSalePrice());
		
		Sedan sedanCar = new Sedan(50, 65000, "black", 25);
		System.out.println(" Sedan Price: " + sedanCar.getSalePrice());	
	}

}
