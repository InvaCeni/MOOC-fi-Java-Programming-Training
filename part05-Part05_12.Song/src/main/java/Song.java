
public class Song {
    private String artist;
    private String title;
    private int duration;

    public Song(String artist, String title, int duration) {
        this.artist = artist;
        this.title = title;
        this.duration = duration;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Song other = (Song) obj;
        return duration == other.duration &&
                artist.equals(other.artist) &&
                title.equals(other.title);
    }
}