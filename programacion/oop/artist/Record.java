import java.util.ArrayList;

public class Record
{
    private String title;
    private Artist artist;
    private ArrayList<Song> songs;

    public Record(String title, Artist artist)
    {
        this.title = title;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public void addSong(Song song)
    {
        songs.add(song);
    }

    public void displayInfo()
    {
        System.out.println("Album: " + title);
        System.out.println("Artist: " + artist.getName());
        System.out.println("Genre: " + artist.getGenre());
        System.out.println("Songs:");
        for (Song song : songs)
        {
            System.out.println("- " + song.getTitle() + " (" + song.getDuration() + " seconds).");
        }
    }
}