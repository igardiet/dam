public class Song
{
    private String title;
    private int length;

    public Song(String title, int length)
    {
        this.title = title;
        this.length = length;
    }

    public String getTitle()
    {
        return title;
    }

    public int getDuration()
    {
        return length;
    }

    public void displayInfo()
    {
        System.out.println("Song: " + title);
        System.out.println("Length: " + length);
    }
}