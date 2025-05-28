import Karigori.*;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        final int numberOfVehicles = 4;
        Vehicle[] vehicles = new Vehicle[numberOfVehicles];


        vehicles[0] = new Car(20, 180, "Red", 25000, 4, "Sedan");
        vehicles[1] = new Bike(10, 120, "Blue", 8000, "4-Stroke");
        vehicles[2] = new Bicycle(0, "Green", 500, 18, true);
        vehicles[3] = new Tractor(50, 40, "Yellow", 75000, true);


        Vehicle selectedVehicle = null;

        System.out.println("\nWelcome to the Enhanced Vehicle System!");
        System.out.println("------------------------------------");
        while (true) {

            if (selectedVehicle == null) {
                System.out.println("Available Vehicles:");
                for (int i = 0; i < vehicles.length; i++) {
                    if (vehicles[i] != null) {
                        System.out.println((i + 1) + ". " + vehicles[i].getClass().getSimpleName() + " (" + vehicles[i].getColor() + ")");
                    }
                }
                System.out.println((vehicles.length + 1) + ". Exit System");
                System.out.print("Select a vehicle to interact with (or exit): ");

                int vehicleChoice = getUserChoice(input, 1, vehicles.length + 1);

                if (vehicleChoice == vehicles.length + 1) {
                    System.out.println("Exiting system. Goodbye!");
                    break;
                }
                if (vehicleChoice - 1 < vehicles.length && vehicles[vehicleChoice - 1] != null) {
                    selectedVehicle = vehicles[vehicleChoice - 1];
                    System.out.println("\n--- You selected: " + selectedVehicle.getClass().getSimpleName() + " ---");

                } else {
                    System.out.println("Invalid selection or vehicle not found at that index.");
                }

            } else {
                System.out.println("\n--- Interacting with: " + selectedVehicle.getClass().getSimpleName() + " (" + selectedVehicle.getColor() + ") ---");
                System.out.println("Options:");
                System.out.println("1. Drive");
                System.out.println("2. Refuel");
                System.out.println("3. Calculate/Update Speed");
                System.out.println("4. View Details");


                int nextOption = 5;
                switch (selectedVehicle) {
                    case Car car : System.out.println(nextOption++ + ". Open Trunk (Car specific)");
                        break;
                    case Bike bike :
                        System.out.println(nextOption++ + ". Perform Stunt (Bike specific)");
                        System.out.println(nextOption++ + ". Set Engine Type (Bike specific)"); // New option for Bike
                        break;
                    case Bicycle bicycle : System.out.println(nextOption++ + ". Ring Bell (Bicycle specific)");
                        break;
                    case Tractor tractor :
                        System.out.println(nextOption++ + ". Attach Implement (Tractor specific)");
                        System.out.println(nextOption++ + ". Detach Implement (Tractor specific)"); // New option for Tractor

                        System.out.println(nextOption++ + ". Engage PTO (Tractor specific)");
                        break;
                    default:
                        break;
                }

                System.out.println("0. Select Another Vehicle");
                System.out.println("99. Exit System");
                System.out.print("Enter your option: ");

                int actionChoice = getUserChoice(input, -1, 99); // Allow various valid inputs

                switch (actionChoice) {
                    case 1:
                        selectedVehicle.drive();
                        break;
                    case 2:
                        selectedVehicle.refuel();
                        break;
                    case 3:
                        selectedVehicle.calculateSpeed();
                        break;
                    case 4:
                        selectedVehicle.displayDetails();
                        break;
                    case 5: // This case now handles the first specific option for any vehicle
                        switch (selectedVehicle) {
                            case Car car -> car.openTrunk();
                            case Bike bike -> bike.performStunt();
                            case Bicycle bicycle -> bicycle.ringBell();
                            case Tractor tractor -> {
                                System.out.print("Enter implement to attach: ");
                                String implement = input.nextLine();
                                tractor.attachImplement(implement);
                            }
                            default ->
                                    System.out.println("Invalid option for this vehicle or generic option 5 chosen.");
                        }
                        break;
                    case 6:
                        if (selectedVehicle instanceof Bike) {
                            System.out.print("Enter new engine type for the Bike: ");
                            String newEngineType = input.nextLine();
                            ((Bike) selectedVehicle).setEngineType(newEngineType);
                            System.out.println("Bike engine type updated to: " + ((Bike) selectedVehicle).getEngineType());
                        } else if (selectedVehicle instanceof Tractor) {
                            ((Tractor) selectedVehicle).detachImplement();
                        } else {
                            System.out.println("Invalid option.");
                        }
                        break;
                    case 7:
                        if (selectedVehicle instanceof Tractor) {
                            ((Tractor) selectedVehicle).engagePTO();
                        } else {
                            System.out.println("Invalid option.");
                        }
                        break;
                    case 0:
                        selectedVehicle = null;
                        break;
                    case 99:
                        System.out.println("Exiting system. Goodbye!");
                        input.close();
                        return;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
                if (selectedVehicle != null) {
                    System.out.println("Current Fuel: " + selectedVehicle.getCurrentFuelLevel() + ", Current Speed: " + selectedVehicle.getCurrentSpeed());
                }
            }
        }

    }
    // Helper method to get valid integer input from user
    private static int getUserChoice(Scanner input, int min, int max) {
        int choice;
        while (true) {
            if (input.hasNextInt()) {
                choice = input.nextInt();
                input.nextLine(); // Consume the newline character after reading an int
                if (choice == 99 || choice == 0 || (choice >= min && choice <= max && choice <= 7)) {
                    break;
                } else {
                    System.out.print("Invalid input. Please enter a valid option number: ");
                }
            } else {
                System.out.print("Invalid input. Please enter a number: ");
                input.nextLine();
            }
        }
        return choice;
    }
}