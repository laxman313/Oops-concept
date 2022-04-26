package com.createiq.abstraction;

public class MGHectaor extends Car {

	public MGHectaor(byte numberOfWheel, byte numberOfDoors, byte numberOfOwners, byte numberOfEmissionStickers,
			short power, short horsepower, short co2emmision, short cubiccapacity, double fuelConsumptionPreciseAverage,
			boolean isDamaged, char energyefficiencycategory, float fuelconsumptionCombined, float fuelconsumptionUrban,
			float fuelconsumptionExtraUrban, int price, int mileage, long regNo, String carName, String color) {
		super(numberOfWheel, numberOfDoors, numberOfOwners, numberOfEmissionStickers, power, horsepower, co2emmision,
				cubiccapacity, fuelConsumptionPreciseAverage, isDamaged, energyefficiencycategory, fuelconsumptionCombined,
				fuelconsumptionUrban, fuelconsumptionExtraUrban, price, mileage, regNo, carName, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void startTheEngine() {
		// TODO Auto-generated method stub
		System.out.println("MGHector engine is started ");
	}

}
