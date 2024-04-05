package arrayList;

import java.util.ArrayList;

public class Names2
{
    public static void main(String[] args)
    {
        ArrayList<String> names = new ArrayList<>();

        names.add("Sophie");
        names.add("Chema");
        names.add("Alex");
        names.add("Rose");

        System.out.println("Size: " + names.size());

        if (names.contains("Juan"))
        {
            System.out.println("Juan is already in the list");
        } else
        {
            System.out.println("Juan is not registered in the list");
        }

        if (!names.isEmpty())
        {
            String removedName = names.remove(names.size() - 1);
            System.out.println("Last element which was removed: " + removedName);
        } else
        {
            System.out.println("The array is empty, no element can be deleted.");
        }

        System.out.println("Remaining names: " + names);
    }
}