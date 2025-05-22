import java.util.Scanner;

public class Car {

    float currentFuelLevel;
    float maxSpeed;
    String color;
    int price;

    Car(){
        currentFuelLevel = 2; //Default level set
        color = "Black";
        price = 500000;
        maxSpeed = 5.5F;
    }

    public void driveCar(){
        if(currentFuelLevel<=0) System.out.println("Car is out of fuel");
        else if(currentFuelLevel<=5){
            System.out.println("Car is driving in reserve mode");
            currentFuelLevel--;
        }
        else{
            System.out.println("Car is driving");
            currentFuelLevel--;
        }
    }

    public void refuel(){
        Scanner input = new Scanner(System.in);
        float fuel = input.nextFloat();

        currentFuelLevel+=fuel;
        System.out.println("Car is refueled");
    }

    public float getSpeed(){
        Scanner input = new Scanner(System.in);
        float distanceDriven = input.nextFloat();
        float duration = input.nextFloat();

        return distanceDriven/duration;

    }



}
