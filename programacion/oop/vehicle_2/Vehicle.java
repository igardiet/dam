package oop.vehicle_2;

public class Vehicle
{
    private String registration;
    private String brand;
    private String model;
    private String color;
    private int numberOfDoors;
    private int power;

    public Vehicle(String registration, String brand, String model, String color, int numberOfDoors, int power)
    {
        this.registration = registration;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.numberOfDoors = numberOfDoors;
        this.power = power;
    }

    public void displayInfo()
    {
        System.out.println("Registration: " + registration);
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Number of doors: " + numberOfDoors);
        System.out.println("Power: " + power);
        System.out.println();
    }
}