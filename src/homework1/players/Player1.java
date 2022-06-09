package homework1.players;

public class Player1 extends BasicPlayer {
    private final int price;

    public Player1(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public void playSong() {
        System.out.println("Player1 playing : " + getSong());
    }

}
