import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Car myCar = new Car();

        while(true) {
            Scanner input = new Scanner(System.in);
            int option = input.nextInt();
            if(option==4) break;
            switch(option) {
                case 1:
                    myCar.driveCar();
                    break;
                case 2:
                    myCar.refuel();
                    break;
                case 3:
                    float speed = myCar.getSpeed();
                    System.out.println("Car Current Speed is: "+speed);
                    if(speed> myCar.maxSpeed) System.out.println("OverSpeeding....");
                    break;
            }
        }
        }
}