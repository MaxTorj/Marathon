package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> artists1 = new ArrayList<>();
        artists1.add("Shawn Crahan");
        artists1.add("Craig Jones");
        artists1.add("Mick Thomson");
        artists1.add("Corey Taylor");
        artists1.add("Sid Wilson");
        artists1.add("Jim Root");
        artists1.add("Alessandro Venturella");
        artists1.add("Jay Weinberg");
        artists1.add("Michael Pfaff");

        MusicBand musicBand1 = new MusicBand("Slipknot", 1995, artists1);

        List<String> artist2 = new ArrayList<>();
        artist2.add("Сергей Кузнецов");
        artist2.add("Юрий Шатунов");
        artist2.add("Вячеслав Пономарёв");
        artist2.add("Константин Пахомов");
        artist2.add("Игорь Игошин");
        artist2.add("Владимир Шурочкин");

        MusicBand musicBand2 = new MusicBand("Ласковый май", 1986, artist2);

        musicBand1.printArtistNames();
        musicBand2.printArtistNames();

        MusicBand.artistTransfer(musicBand1, musicBand2);

        musicBand1.printArtistNames();
        musicBand2.printArtistNames();
    }
}
