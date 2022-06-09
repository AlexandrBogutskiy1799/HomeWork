package homework1.players;

import java.util.Random;

public class Player6 extends BasicPlayer {
    private String[] playlist = {"song1", "song2", "song3", "song4"};
    private final int price;

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
        System.out.println("Player6 playing : " + getSong());
    }

    public void shuffle() {
        Random rnd = new Random();
        for (int i = 0; i < playlist.length; i++) {
            int j = rnd.nextInt(playlist.length);
            String temp = playlist[i];
            playlist[i] = playlist[j];
            playlist[j] = temp;
            System.out.println();
        }
    }

    public void playAllSongs() {
        for (int i = 0; i < playlist.length; i++) {
            System.out.println("Player6 playing : " + playlist[i]);
        }
    }
}
