package Karigori;

public class FourWheeler extends Vehicle {

    public FourWheeler(float currentFuelLevel, float maxSpeed, String color, int price) {
        super(currentFuelLevel, maxSpeed, color, price); // Call Vehicle constructor
    }

    public int getNumberOfTires() {
        return 4;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Tires: " + getNumberOfTires());
    }
}