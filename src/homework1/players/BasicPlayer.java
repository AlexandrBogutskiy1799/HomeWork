package homework1.players;

public class BasicPlayer {
    protected String song;

    /// public String[] playlist = new String[]{song1, song2, song3};

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public void playSong() {
        System.out.println("Playing:" + getSong());
    }

}

