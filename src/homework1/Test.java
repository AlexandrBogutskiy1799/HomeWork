package homework1;

import homework1.players.*;

class Test {
    public static void main(String[] args) {
        Player1 player1 = new Player1(60);
        Player3 player3 = new Player3(75);
        Player2 player2 = new Player2(35);
        Player4 player4 = new Player4(90);
        Player5 player5 = new Player5(115);
        Player6 player6 = new Player6(120);
        String[] playlist = {"song1", "song2", "song3"};
        player6.setPlaylist(playlist);
        player6.shuffle();
        for (String song : player6.getPlaylist()) {

            System.out.println(song);

        }

        player1.setSong("Songsong");
        player1.playSong();
    }

}
