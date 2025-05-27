package Karigori;

public class Bike extends TwoWheeler {
    private String engineType;

    public Bike(float currentFuelLevel, float maxSpeed, String color, int price, String engineType) {
        super(currentFuelLevel, maxSpeed, color, price); // Call to TwoWheeler constructor
        this.engineType = engineType;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    // setting a bike-specific method
    public void performStunt() {
        if (currentSpeed > 20) {
            System.out.println("Bike is performing a wheelie!");
        } else {
            System.out.println("Need more speed to perform a stunt.");
        }
    }

    @Override
    public void displayDetails() {
        super.displayDetails(); // Call TwoWheeler displayDetails
        System.out.println("Engine Type: " + getEngineType());
    }
}