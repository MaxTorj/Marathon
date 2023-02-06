package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> artists1 = new ArrayList<>();
        artists1.add(new MusicArtist("Shawn Crahan", 45));
        artists1.add(new MusicArtist("Craig Jones", 42));
        artists1.add(new MusicArtist("Mick Thomson", 47));
        artists1.add(new MusicArtist("Corey Taylor", 51));
        artists1.add(new MusicArtist("Sid Wilson", 52));
        artists1.add(new MusicArtist("Jim Root", 50));
        artists1.add(new MusicArtist("Alessandro Venturella", 44));
        artists1.add(new MusicArtist("Jay Weinberg", 41));
        artists1.add(new MusicArtist("Michael Pfaff", 48));

        MusicBand musicBand1 = new MusicBand("Slipknot", 1995, artists1);

        List<MusicArtist> artists2 = new ArrayList<>();
        artists2.add(new MusicArtist("Сергей Кузнецов", 65));
        artists2.add(new MusicArtist("Юрий Шатунов", 63));
        artists2.add(new MusicArtist("Вячеслав Пономарёв", 67));
        artists2.add(new MusicArtist("Константин Пахомов", 62));
        artists2.add(new MusicArtist("Игорь Игошин", 64));
        artists2.add(new MusicArtist("Владимир Шурочкин", 68));

        MusicBand musicBand2 = new MusicBand("Ласковый май", 1986, artists2);

        musicBand1.printArtistNames();
        musicBand2.printArtistNames();

        MusicBand.artistTransfer(musicBand1, musicBand2);

        musicBand1.printArtistNames();
        musicBand2.printArtistNames();
    }
}
