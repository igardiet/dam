package oop.person;

public class Employee extends Person
{
    private double salary;
    private double commission;

    // Constructor sin parámetros
    public Employee()
    {
        super();
    }

    public Employee(String name, String surname, int age, double salary, double commission)
    {
        super(name, surname, age);
        if (salary > 0 && commission > 0)
        {
            this.salary = salary;
            this.commission = commission;
        } else
        {
            System.out.println("Error: Salary and commission must be higher than 0.");
        }
    }

    public double getSalary()
    {
        return salary;
    }

    public void setSalary(double salary)
    {
        if (salary > 0)
        {
            this.salary = salary;
        } else
        {
            System.out.println("Error: Salary must be higher than 0.");
        }
    }

    public double getCommission()
    {
        return commission;
    }

    public void setCommission(double commission)
    {
        if (commission > 0)
        {
            this.commission = commission;
        } else
        {
            System.out.println("Error: Commission must be higher than 0.");
        }
    }

    public double totalEarned()
    {
        return salary + commission;
    }

    @Override
    public void displayInfo()
    {
        super.displayInfo();
        System.out.println("Salary: " + salary + " Commission: " + commission + " Total earned: " + totalEarned());
        System.out.println();
    }
}