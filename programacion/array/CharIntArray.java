package array;

public class CharIntArray
{
    public static void main(String[] args)
    {
        char[] charArray = { 'a', 'e', 'r', 't', 'y', 'u' };
        int[] intArray = { 1, 2, 3, 4, 5, 6 };

        int[] newArray = new int[charArray.length + intArray.length];

        for (int i = 0; i < newArray.length; i++)
        {
            newArray[i] = i + 1;
            System.out.println(newArray[i]);
        }
    }
}