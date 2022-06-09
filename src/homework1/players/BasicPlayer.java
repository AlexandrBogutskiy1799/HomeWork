package homework1.players;

abstract public class BasicPlayer {

    protected String song;


    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public void playSong() {
        System.out.println("Playing:" + getSong());
    }

}
