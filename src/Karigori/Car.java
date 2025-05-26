package Karigori;

import java.util.Scanner;

public class Car {

    private float currentFuelLevel;
    private final float maxSpeed;
    private final String color;
    private final int price;
    private float currentSpeed;

    public Car(float currentFuelLevel,float maxSpeed,String color,int price){  //Parameterized Constructor
        this.currentFuelLevel = currentFuelLevel;  //this.classVariable = parameterVariable
        this.color = color;
        this.price = price;
        this.maxSpeed = maxSpeed;
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


    public void driveCar(){
        if(currentFuelLevel<=0) System.out.println("Karigori.Car is out of fuel");
        else if(currentFuelLevel<=5){
            System.out.println("Karigori.Car is driving in reserve mode");
            currentFuelLevel--;
        }
        else{
            System.out.println("Karigori.Car is driving");
            currentFuelLevel--;
        }
    }

    public void refuel(){
        System.out.print("Enter the amount of fuel: ");
        Scanner input = new Scanner(System.in);
        float fuel = input.nextFloat();

        currentFuelLevel+=fuel;
        System.out.println("Karigori.Car is refueled");
    }

    public void getSpeed(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter distance covered: ");
        float distanceDriven = input.nextFloat();
        System.out.print("Enter Time Elapsed: ");
        float duration = input.nextFloat();

        currentSpeed+=distanceDriven/duration;

    }
}
