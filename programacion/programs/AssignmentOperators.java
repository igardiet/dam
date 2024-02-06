package programs;

public class AssignmentOperators
{
    public static void main(String[] args)
    {
        double saldo = 100.50;
        System.out.println("Initial balance: " + "€" + saldo);

        saldo += 27.50;
        saldo *= 2;
        saldo /= 2;
        saldo += 250.38;
        saldo -= 55.37;
        saldo += 1200.96;

        System.out.println("Current balance: " + "€" + saldo);

        saldo -= 85.23;

        System.out.println("Final balance: " + "€" + saldo);
    }
}