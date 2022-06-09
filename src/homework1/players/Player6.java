package homework1.players;

import java.util.Random;

public class Player6 extends BasicPlayer {
    private String[] playlist;

    final int price;

    public Player6(int price) {
        this.price = price;
    }

    public String[] getPlaylist() {
        return playlist;
    }

    public void setPlaylist(String[] playlist) {
        this.playlist = playlist;
    }

    public int getPrice() {
        return price;
    }

    public void playSong() {
        System.out.println("Playing: " + getSong());
    }


    public void shuffle() {
        Random rnd = new Random();
        for (int i = 0; i < playlist.length; i++) {
            int j = rnd.nextInt(playlist.length);
            String temp = playlist[i];
            playlist[i] = playlist[j];
            playlist[j] = temp;
        }
    }

    public void playAllSongs() {
        for (int i = 0; i < playlist.length; i++) {
            System.out.println(playlist[i]);
        }
    }
}
