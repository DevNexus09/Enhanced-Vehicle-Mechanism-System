package Karigori;

public abstract class TwoWheeler extends Vehicle {

    public TwoWheeler(float currentFuelLevel, float maxSpeed, String color, int price) {
        super(currentFuelLevel, maxSpeed, color, price);
    }

    public int getNumOfTires() {
        return 2;
    }
}
