public class Artist
{
    private String name;
    private String genre;
    private int age;

    public Artist(String name, String genre, int age)
    {
        this.name = name;
        this.genre = genre;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public String getGenre()
    {
        return genre;
    }

    public int getAge()
    {
        return age;
    }

    public void displayInfo()
    {
        System.out.println("Artist: " + name);
        System.out.println("Genre: " + genre);
        System.out.println("Age: " + age);
    }
}