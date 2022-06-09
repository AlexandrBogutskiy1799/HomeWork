package homework1.players;

public class Player4 extends BasicPlayer {
    private final int price;
    private String[] playlist = {"song1", "song2", "song3", "song4"};

    public Player4(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String[] getPlaylist() {
        return playlist;
    }

    public void setPlaylist(String[] playlist) {
        this.playlist = playlist;
    }

    @Override
    public void playSong() {
        System.out.println("Player4 playing : " +playlist[playlist.length - 1]);
    }

    public void playAllSongs() {
        for (int i = 0; i < playlist.length; i++) {
            System.out.println("Player4 playing : " + playlist[i]);
        }
    }
}
