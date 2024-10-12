package oop.vehicle_2;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Tourism("ABC123", "Toyota", "Corolla", "Red", 4, 130, 5));
        vehicles.add(new Tourism("DEF456", "Ford", "Focus", "Blue", 4, 150, 4));

        vehicles.add(new Sports("GHI789", "Porsche", "911", "Negro", 2, 450, true));
        vehicles.add(new Sports("JKL012", "Ferrari", "488", "Red", 2, 670, false));

        for (Vehicle vehicle : vehicles)
        {
            vehicle.displayInfo();
        }
    }
}