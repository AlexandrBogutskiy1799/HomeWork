package homework1.players;

public class Player1 extends BasicPlayer {

    final int price;

    public Player1(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    ////////////////не совсем понятно насчёт переменной."её нельзя объявить в этом классе, но плеер может проиграть эту песню????
    @Override
    public void playSong() {
        System.out.println("Playing: " + getSong());
    }

}
