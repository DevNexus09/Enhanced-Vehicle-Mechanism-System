
import Karigori.Car;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        Car myCar = new Car(3,25,"Black",500000); //Parameterized Constructor Call

        System.out.println("Welcome to the Karigori.Car Mechanism System");
        System.out.println("Options:");
        System.out.println("1.Start Driving");
        System.out.println("2.Refuel Karigori.Car");
        System.out.println("3.Get Karigori.Car speed");
        System.out.println("4.Get Karigori.Car details");
        System.out.println("5.Exit");

        while(true) {
            System.out.print("Enter Your Option: ");
            Scanner input = new Scanner(System.in);
            int option = input.nextInt();
            if(option == 5) {
                System.out.println("Thanks for using our system...");
                break;
            }
            switch(option) {
                case 1:
                    myCar.driveCar();
                    break;
                case 2:
                    System.out.println("Starting Refueling....");
                    myCar.refuel();
                    break;
                case 3:
                    myCar.getSpeed();
                    System.out.println("Karigori.Car Current Speed is: "+myCar.getCurrentSpeed());
                    if(myCar.getCurrentSpeed() > myCar.getMaxSpeed()) System.out.println("OverSpeeding....");
                    break;
                case 4:
                    System.out.println("Karigori.Car Details-");
                    System.out.println("Karigori.Car color is: "+myCar.getColor());
                    System.out.println("Karigori.Car price is: "+myCar.getPrice());
                    System.out.println("Current Fuel Level is: "+myCar.getCurrentFuelLevel());
                    System.out.println("Current Speed: "+myCar.getCurrentSpeed());
                    break;
            }
        }
        }
}