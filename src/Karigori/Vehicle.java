package Karigori;

import java.util.Scanner;

public abstract class Vehicle {

    protected float currentFuelLevel;
    protected final float maxSpeed;
    protected final String color;
    protected final int price;
    protected float currentSpeed;


    public Vehicle(float currentFuelLevel, float maxSpeed, String color, int price) { // Parameterized Constructor
        this.currentFuelLevel = currentFuelLevel;
        this.color = color;
        this.price = price;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = 0; // Initialize current speed
    }


    public String getColor() {
        return color;
    }

    public float getMaxSpeed() {
        return maxSpeed;
    }

    public float getCurrentFuelLevel() {
        return currentFuelLevel;
    }

    public float getCurrentSpeed() {
        return currentSpeed;
    }

    public int getPrice() {
        return price;
    }


    public void drive() {
        if (currentFuelLevel <= 0) {
            System.out.println(this.getClass().getSimpleName() + " is out of fuel.");
        } else if (currentFuelLevel <= 5) {
            System.out.println(this.getClass().getSimpleName() + " is driving in reserve mode.");
            currentFuelLevel--;
        } else {
            System.out.println(this.getClass().getSimpleName() + " is driving.");
            currentFuelLevel--;
        }
    }

    public void refuel() {
        System.out.print("Enter the amount of fuel to add: ");
        Scanner input = new Scanner(System.in);
        float fuel = input.nextFloat();
        input.nextLine(); // Consume the newline
        currentFuelLevel += fuel;
        System.out.println(this.getClass().getSimpleName() + " is refueled. Current fuel: " + currentFuelLevel);
    }

    public void calculateSpeed() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter distance covered (km): ");
        float distanceDriven = input.nextFloat();
        input.nextLine(); // Consume the newline
        System.out.print("Enter time elapsed (hours): ");
        float duration = input.nextFloat();
        input.nextLine(); // Consume the newline

        if (duration <= 0) {
            System.out.println("Time elapsed must be greater than zero.");
            return;
        }
        currentSpeed = distanceDriven / duration;
        System.out.println(this.getClass().getSimpleName() + " current speed is: " + currentSpeed + " km/h");
        if (currentSpeed > maxSpeed) {
            System.out.println("OverSpeeding....");
        }
    }

    public void displayDetails() {
        System.out.println("\n--- " + this.getClass().getSimpleName() + " Details ---");
        System.out.println("Color: " + getColor());
        System.out.println("Price: $" + getPrice());
        System.out.println("Max Speed: " + getMaxSpeed() + " km/h");
        System.out.println("Current Fuel Level: " + getCurrentFuelLevel());
        System.out.println("Current Speed: " + getCurrentSpeed() + " km/h");
    }
}
