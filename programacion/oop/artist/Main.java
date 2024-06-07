public class Main
{
    public static void main(String[] args)
    {
        Artist artist = new Artist("Jimi Hendrix", "Psychedelic Rock", 27);

        Song song1 = new Song("Purple Haze", 156);
        Song song2 = new Song("Can You See Me?", 141);

        Record record = new Record("Are You Experienced?", artist);

        record.addSong(song1);
        record.addSong(song2);

        record.displayInfo();
    }
}