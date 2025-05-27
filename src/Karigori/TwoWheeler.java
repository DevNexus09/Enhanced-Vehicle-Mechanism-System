package Karigori;

public class TwoWheeler extends Vehicle {

    private final int numOfTires = 2;
    public TwoWheeler(float currentFuelLevel, float maxSpeed, String color, int price) {
        super(currentFuelLevel, maxSpeed, color, price);
    }

    public int getNumOfTires() {
        return numOfTires;
    }
}
