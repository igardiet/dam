package oop.vehicle_2;

public class Tourism extends Vehicle
{
    private int numberOfSeats;

    public Tourism(String registration, String brand, String model, String color, int numberOfDoors, int power, int numberOfSeats)
    {
        super(registration, brand, model, color, numberOfDoors, power);
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("Number of seats: " + numberOfSeats);
        System.out.println();
    }
}