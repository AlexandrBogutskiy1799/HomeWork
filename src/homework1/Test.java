package homework1;

import homework1.players.*;

class Test {
    public static void main(String[] args) {
        Player1 player1 = new Player1(60);
        Player2 player2 = new Player2(62);
        Player3 player3 = new Player3(75);
        Player4 player4 = new Player4(90);
        Player5 player5 = new Player5(115);
        Player6 player6 = new Player6(120);
        String[] playlist = {"song1", "song2", "song3", "song4"};

        player1.setSong("sha-la-la");
        player1.playSong();
        System.out.println();

        player2.playSong();
        System.out.println();

        player3.setSong("bom-bom-bom");
        player3.playSong();
        System.out.println();
        player3.playAllSongs();
        System.out.println();

        player4.playSong();
        System.out.println();
        player4.playAllSongs();
        System.out.println();

        player5.setSong("Para-pa-pa");
        player5.playSong();
        System.out.println();
        player5.playAllSongs();
        System.out.println();

        player6.setSong("Tra-lya-lya");
        player6.playSong();
        System.out.println();
        player6.playAllSongs();
        player6.shuffle();
        player6.playAllSongs();









        /*for (String song : player6.getPlaylist()) {

            System.out.println(song);

        }*/
    }
}
