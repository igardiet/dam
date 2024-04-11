import java.util.Scanner;
import java.util.ArrayList;

public class Employees
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> employees = new ArrayList<>();

        while (true)
        {
            System.out.println("Employees Manager Menu:");
            System.out.println("1. Add Employees");
            System.out.println("2. Modify Employee");
            System.out.println("3. Remove Employee");
            System.out.println("4. View Employee");
            System.out.println("5. View All Employees");
            System.out.println("6. Exit");

            System.out.println("Enter your choice:");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice)
            {
            case 1:
                System.out.println("Enter number of employees to add:");
                int count = scanner.nextInt();
                scanner.nextLine();
                for (int i = 0; i < count; i++)
                {
                    System.out.println("Enter employee name:");
                    String newEmployee = scanner.nextLine();
                    employees.add(newEmployee);
                }
                break;
            case 2:
                System.out.println("Enter index of employee to modify:");
                int indexToUpdate = scanner.nextInt();
                scanner.nextLine();
                if (indexToUpdate >= 0 && indexToUpdate < employees.size())
                {
                    System.out.println("Enter updated employee name:");
                    String updatedEmployee = scanner.nextLine();
                    employees.set(indexToUpdate, updatedEmployee);
                    System.out.println("Employee updated successfully.");
                } else
                {
                    System.out.println("Invalid index. No employee found.");
                }
                break;
            case 3:
                System.out.println("Enter index of employee to remove:");
                int indexToRemove = scanner.nextInt();
                scanner.nextLine();
                if (indexToRemove >= 0 && indexToRemove < employees.size())
                {
                    employees.remove(indexToRemove);
                    System.out.println("Employee removed succesfully.");
                } else
                {
                    System.out.println("Invalid index. No employee found.");
                }
                break;
            case 4:
                System.out.println("Enter index of employee to view:");
                int indexToView = scanner.nextInt();
                scanner.nextLine();
                if (indexToView >= 0 && indexToView < employees.size())
                {
                    System.out.println("Employee at index " + indexToView + ": " + employees.get(indexToView));
                } else
                {
                    System.out.println("Invalid index. No employee found.");
                }
                break;
            case 5:
                System.out.println("All Employees:");
                for (String employee : employees)
                {
                    System.out.println(employee);
                }
                break;
            case 6:
                System.out.println("Exiting...");
                scanner.close();
                System.exit(0);
            default:
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}