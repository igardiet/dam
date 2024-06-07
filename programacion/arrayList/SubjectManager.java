import java.util.ArrayList;
import java.util.Scanner;

public class SubjectManager
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> subjects = new ArrayList<>();

        System.out.println("Subject Manager");

        while (true)
        {
            System.out.println("\nSelect an option:");
            System.out.println("1. Add a new subject");
            System.out.println("2. Show all subjects");
            System.out.println("3. Search for a subject by name");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice)
            {
            case 1:
                System.out.println("Enter the name of the new subject:");
                String newSubject = scanner.nextLine();
                subjects.add(newSubject);
                System.out.println("Subject succesfully added!");
                break;
            case 2:
                System.out.println("List of subjects:");
                for (String subject : subjects)
                {
                    String subjectToUpperCase = subject.toUpperCase();
                    System.out.println("- " + subjectToUpperCase);
                }
                break;
            case 3:
                System.out.println("Enter the name of the subject to search:");
                String searchSubject = scanner.nextLine();
                if (subjects.contains(searchSubject))
                {
                    System.out.println(searchSubject + " is already in the list!");
                } else
                {
                    System.out.println(searchSubject + " is not in the list.");
                }
                break;
            case 4:
                System.out.println("Exiting program...");
                scanner.close();
                System.exit(0);
            default:
                System.out.println("Invalid option. Please try again.");
            }
        }
    }
}