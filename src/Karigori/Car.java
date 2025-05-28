package Karigori;

public class Car extends FourWheeler {
    private final int numberOfDoors;
    private final String carType;

    public Car(float currentFuelLevel, float maxSpeed, String color, int price, int numberOfDoors, String carType) {
        super(currentFuelLevel, maxSpeed, color, price); // Call FourWheeler constructor
        this.numberOfDoors = numberOfDoors;
        this.carType = carType;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public String getCarType() {
        return carType;
    }

    // Car-specific methods can be added here
    public void openTrunk() {
        System.out.println(getCarType() + " trunk is open.");
    }

    @Override //Method Overriding
    public void displayDetails() {
        super.displayDetails(); // Call FourWheeler displayDetails
        System.out.println("Number of Doors: " + getNumberOfDoors());
        System.out.println("Car Type: " + getCarType());
    }
}