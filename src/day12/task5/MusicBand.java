package day12.task5;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> artistNames;

    public MusicBand(String name, int year, List<MusicArtist> artistNames) {
        this.name = name;
        this.year = year;
        this.artistNames = artistNames;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<MusicArtist> getArtistNames() {
        return artistNames;
    }

    public void setArtistNames(List<MusicArtist> artistNames) {
        this.artistNames = artistNames;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", artistName='" + artistNames + '\'' +
                '}';
    }

    public static void artistTransfer(MusicBand a, MusicBand b) {
        for (MusicArtist artist : a.getArtistNames()) {
            b.getArtistNames().add(artist);

            a.getArtistNames().clear();
        }
    }

    public void printArtistNames() {
        System.out.println(this.artistNames);
    }
}

