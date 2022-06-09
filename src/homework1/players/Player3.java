package homework1.players;

public class Player3 extends BasicPlayer {
    private final int price;
    private String[] playlist = {"song1", "song2", "song3", "song4"};

    public String[] getPlaylist() {
        return playlist;
    }

    public void setPlaylist(String[] playlist) {
        this.playlist = playlist;
    }

    public Player3(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }


    public void playSong() {
        System.out.println("Player3 playing : " + getSong());
    }

    public void playAllSongs() {
        for (int i = 0; i < playlist.length; i++) {
            System.out.println("Player3 playing :" + playlist[i]);
        }
    }
}


