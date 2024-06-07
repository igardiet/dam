public class Car extends Vehicle
{
    private String model;
    private String color;

    public Car(String brand, int year, String model, String color)
    {
        super(brand, year);
        this.model = model;
        this.color = color;
    }

    public String getModel()
    {
        return model;
    }

    public String getColor()
    {
        return color;
    }

    @Override
    public void displayInfo()
    {
        System.out.println("Car: " + getBrand() + " " + model + " (" + getYear() + ")");
    }
}