public class Main
{
    public static void main(String[] args)
    {
        Car toyota = new Car("Toyota", 1988, "Corolla", "green");
        Car subaru = new Car("Subaru", 2003, "Impresa", "Grey");

        Motorcycle honda = new Motorcycle("Honda", 2000, "CBR");
        Motorcycle kawasaki = new Motorcycle("Kawasaki", 2006, "Ninja");

        toyota.displayInfo();
        subaru.displayInfo();
        honda.displayInfo();
        kawasaki.displayInfo();
    }
}