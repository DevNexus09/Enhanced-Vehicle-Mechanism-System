import java.util.Scanner;

public class Car {

    float currentFuelLevel;
    float maxSpeed;
    String color;
    int price;
    float currentSpeed;

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
        System.out.print("Enter the amount of fuel: ");
        Scanner input = new Scanner(System.in);
        float fuel = input.nextFloat();

        currentFuelLevel+=fuel;
        System.out.println("Car is refueled");
    }

    public void getSpeed(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter distance covered: ");
        float distanceDriven = input.nextFloat();
        System.out.print("Enter Time Elapsed: ");
        float duration = input.nextFloat();

        currentSpeed+=distanceDriven/duration;

    }
    public void getCarDetails(){

        System.out.println("Car color is: "+color);
        System.out.println("Car price is: "+price);
        System.out.println("Current Fuel Level is: "+currentFuelLevel);
        System.out.println("Current Speed: "+currentSpeed);
    }



}
