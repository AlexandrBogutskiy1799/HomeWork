package homework1.players;

public class Player2 extends BasicPlayer {
    private final int price;

    public Player2(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void playSong() {
        System.out.println("Player2 playing : " + getSong());

    }

}