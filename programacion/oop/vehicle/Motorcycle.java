public class Motorcycle extends Vehicle
{
    private String model;

    public Motorcycle(String brand, int year, String model)
    {
        super(brand, year);
        this.model = model;
    }

    public String getType()
    {
        return model;
    }

    @Override
    public void displayInfo()
    {
        System.out.println("Motorcycle: " + getBrand() + " " + model + " (" + getYear() + ")");
    }
}