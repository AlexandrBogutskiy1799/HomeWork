package homework1.players;

public class Player4 extends BasicPlayer {
    final int price;

    public Player4(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}

   /* @Override
    public void playSong() {
        System.out.println(playlist[playlist.length - 1]);
    }

    public void playAllSongs() {
        for (int i = 0; i < playlist.length; i++) {
            System.out.println(playlist[i]);
        }
    }
}
*/