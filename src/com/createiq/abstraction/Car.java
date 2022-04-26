package com.createiq.abstraction;

public abstract class Car {
	private byte numberOfWheel=4;
	private byte numberOfDoors=4; 
	private byte numberOfOwners=1;
	private byte numberOfSeats=4;
	private byte numberOfEmissionStickers=4;
	private short power=656;
	private short horsepower=356;
	private short Co2emmision=546;
	private short cubiccapacity=6451;
	private double fuelConsumptionPreciseAverage=153.4564651245d;
	private boolean isDamaged=true;
	private char energyefficiencycategory='G';
	
	private float fuelconsumptionCombined=25.47f;
	private float fuelconsumptionUrban =22.45f;
	private float fuelconsumptionExtraUrban=20.78f;
	private int price=29999;
	private int mileage=46622;
	private long regNo=44586125623l;
	private String carName;
	private String color;
	public Car(byte numberOfWheel, byte numberOfDoors, byte numberOfOwners, byte numberOfEmissionStickers, short power,
			short horsepower, short co2emmision, short cubiccapacity, double fuelConsumptionPreciseAverage,
			boolean isDamaged, char energyefficiencycategory, float fuelconsumptionCombined, float fuelconsumptionUrban,
			float fuelconsumptionExtraUrban, int price, int mileage, long regNo, String carName, String color) {
		super();
		this.numberOfWheel = numberOfWheel;
		this.numberOfDoors = numberOfDoors;
		this.numberOfOwners = numberOfOwners;
		this.numberOfEmissionStickers = numberOfEmissionStickers;
		this.power = power;
		this.horsepower = horsepower;
		this.Co2emmision = co2emmision;
		this.cubiccapacity = cubiccapacity;
		this.fuelConsumptionPreciseAverage = fuelConsumptionPreciseAverage;
		this.isDamaged = isDamaged;
		this.energyefficiencycategory = energyefficiencycategory;
		this.fuelconsumptionCombined = fuelconsumptionCombined;
		this.fuelconsumptionUrban = fuelconsumptionUrban;
		this.fuelconsumptionExtraUrban = fuelconsumptionExtraUrban;
		this.price = price;
		this.mileage = mileage;
		this.regNo = regNo;
		this.carName = carName;
		this.color = color;
	}

    public abstract void startTheEngine();

    public void getDescription(){
        System.out.println("A " + color + " " + carName + " is created.");
        System.out.println("Price: €" + price);
        System.out.println("Mileage: " + mileage + "km");
        System.out.println("The car is damaged: " + isDamaged);
        System.out.println("Registration number: " + regNo );
        System.out.println("Cubic capacity: " + cubiccapacity);
        System.out.println("Power: " + power + "kW(" + horsepower + "hp)");
        System.out.println("CO2 emission: " + Co2emmision + "g/km");
        System.out.println("Emission sticker: " + numberOfEmissionStickers + " ( Energy efficiency: " + energyefficiencycategory + ")");
        System.out.println("Combined fuel consumption: " + fuelconsumptionCombined + "l/100km");
        System.out.println("Urban fuel consumption: " + fuelconsumptionUrban + "l/100km");
        System.out.println("Extra urban fuel consumption: " + fuelconsumptionExtraUrban + "l/100km");
        System.out.println("Precise combined fuel consumption: " + fuelConsumptionPreciseAverage + "l/100km");
        System.out.println("Number of previous owners: " + numberOfOwners);
        System.out.println("Number of doors: " + numberOfDoors);
        System.out.println("Number of seats: " + numberOfSeats);
    }public int getPrice() {
    	return price ;
    }

	public void setPrice(int price) {
		this.price = Math.abs(price);
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = Math.abs(mileage);
	}public String getCarname() {
		return carName;
	}

	
	
	

}
