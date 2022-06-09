package homework1.players;

public class Player5 extends BasicPlayer {
    private final int price;
    private String[] playlist = {"song1", "song2", "song3", "song4"};

    public Player5(int price) {
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
        System.out.println("Player5 playing: " + getSong());
    }

    public void playAllSongs() {
        int n = playlist.length;
        String temp;

        for (int i = 0; i < n / 2; i++) {
            temp = playlist[n - i - 1];
            playlist[n - i - 1] = playlist[i];
            playlist[i] = temp;
        }
        for (int i = 0; i < playlist.length; i++) {
            System.out.println("Player5 playing : " +playlist[i]);
        }
    }
}
   /* public void playAllSongs() {
        int n = playlist.length;
        String temp;

        for (int i = 0; i < n / 2; i++) {
            temp = playlist[n - i - 1];
            playlist[n - i - 1] = playlist[i];
            playlist[i] = temp;
        }
        for (int i = 0; i < playlist.length; i++) {
            System.out.println(playlist[i]);
        }
    }
}

*/