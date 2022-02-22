package com.bridgelab.autoshop;

public class Ford extends Car {
	
	int year;
	int manufacturerDiscount;
	
	public Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
		super(speed, regularPrice, color);
		this.year = year;
		this.manufacturerDiscount = manufacturerDiscount;
	}
	
	public double getSalePrice() {
		return regularPrice - regularPrice * (manufacturerDiscount / 100.0);
	}

}
