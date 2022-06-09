package homework1.players;

public class Player3 extends BasicPlayer {
    private final int price;

    public Player3(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void playSong() {
        System.out.println("Playing:" + getSong());
    }
}
   /* public void playAllSongs() {
        for (int i = 0; i < playlist.length; i++) {
            System.out.println(playlist[i]);
        }
    }
*/