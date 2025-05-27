package Karigori;

public class Bicycle extends TwoWheeler {
    private final int numberOfGears;
    private final boolean hasBell;


    public Bicycle(float maxSpeed, String color, int price, int numberOfGears, boolean hasBell) {
        super(0, maxSpeed, color, price);
        this.numberOfGears = numberOfGears;
        this.hasBell = hasBell;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public boolean hasBell() {
        return hasBell;
    }

    public void ringBell() {
        if (hasBell) {
            System.out.println("Ring Ring! Bicycle bell rung.");
        } else {
            System.out.println("This bicycle doesn't have a bell.");
        }
    }


    @Override
    public void drive() {
        System.out.println("Bicycle is being pedaled.");
        if (currentSpeed > 0) {
            System.out.println("Coasting at " + currentSpeed + " km/h");
        }
    }

    @Override
    public void refuel() {
        System.out.println("Bicycles don't need refueling! Maybe a snack for the rider?");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Gears: " + getNumberOfGears());
        System.out.println("Has Bell: " + (hasBell() ? "Yes" : "No"));
    }
}