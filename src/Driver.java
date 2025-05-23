
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        Car myCar = new Car(3,25,"Black",500000); //Parameterized Constructor Call

        System.out.println("Welcome to the Car Mechanism System");
        System.out.println("Options:");
        System.out.println("1.Start Driving");
        System.out.println("2.Refuel Car");
        System.out.println("3.Get Car speed");
        System.out.println("4.Get Car details");
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
                    System.out.println("Car Current Speed is: "+myCar.currentSpeed);
                    if(myCar.currentSpeed > myCar.maxSpeed) System.out.println("OverSpeeding....");
                    break;
                case 4:
                    System.out.println("Car Details-");
                    myCar.getCarDetails();
                    break;
            }
        }
        }
}