import java.util.ArrayList;

public class Names
{
    public static void main(String[] args)
    {
        ArrayList<String> names = new ArrayList<>();

        names.add("John");
        names.add("Paul");
        names.add("George");
        names.add("Ringo");

        for (String name : names)
        {
            System.out.println(name);
        }
    }
}