package Karigori;

public class Tractor extends FourWheeler {
    private final boolean hasPTO;
    private String implementAttached;

    public Tractor(float currentFuelLevel, float maxSpeed, String color, int price, boolean hasPTO) {
        super(currentFuelLevel, maxSpeed, color, price); // Call FourWheeler constructor
        this.hasPTO = hasPTO;
        this.implementAttached = "None";
    }

    public boolean hasPTO() {
        return hasPTO;
    }

    public String getImplementAttached() {
        return implementAttached;
    }

    public void attachImplement(String implement) {
        this.implementAttached = implement;
        System.out.println(implement + " attached to the tractor.");
    }

    public void detachImplement() {
        System.out.println(this.implementAttached + " detached from the tractor.");
        this.implementAttached = "None";
    }

    public void engagePTO() {
        if (hasPTO) {
            System.out.println("PTO engaged on the tractor.");
        } else {
            System.out.println("This tractor does not have PTO.");
        }
    }

    @Override //Method Overriding
    public void displayDetails() {
        super.displayDetails(); // Call FourWheeler displayDetails
        System.out.println("Has PTO: " + (hasPTO() ? "Yes" : "No"));
        System.out.println("Implement Attached: " + getImplementAttached());
    }
}