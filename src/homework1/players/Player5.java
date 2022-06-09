package homework1.players;

public class Player5 extends BasicPlayer {
    final int price;

    public Player5(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
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
