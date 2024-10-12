package oop.vehicle_2;

public class Sports extends Vehicle
{
    private boolean isConvertible;

    public Sports(String registration, String brand, String model, String color, int numberOfDoors, int power, boolean isConvertible)
    {
        super(registration, brand, model, color, numberOfDoors, power);
        this.isConvertible = isConvertible;
    }

    @Override
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("Is convertible? " + (isConvertible ? "Yes" : "No"));
        System.out.println();
    }
}