package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        MusicBand band1 = new MusicBand("Limp Bizkit", 1994);
        MusicBand band2 = new MusicBand("Linkin Park", 1996);
        MusicBand band3 = new MusicBand("Korn", 1993);
        MusicBand band4 = new MusicBand("Slipknot", 1995);
        MusicBand band5 = new MusicBand("Metallica", 1981);
        MusicBand band6 = new MusicBand("Fall Out Boy", 2001);
        MusicBand band7 = new MusicBand("Panic! at the Disco", 2004);
        MusicBand band8 = new MusicBand("Bullet for My Valentine", 1998);
        MusicBand band9 = new MusicBand("OneRepublic", 2002);
        MusicBand band10 = new MusicBand("Cream Soda", 2012);

        List<MusicBand> bands = new ArrayList<>();
        bands.add(band1);
        bands.add(band2);
        bands.add(band3);
        bands.add(band4);
        bands.add(band5);
        bands.add(band6);
        bands.add(band7);
        bands.add(band8);
        bands.add(band9);
        bands.add(band10);

        System.out.println(bands);

        Collections.shuffle(bands);

        System.out.println(bands);

        System.out.println(Task3.groupsAfter2000(bands));

    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> bandsAfter2000 = new ArrayList<>();
        for (MusicBand band : bands) {
            if (band.getYear() > 2000)
                bandsAfter2000.add(band);
        }
        return bandsAfter2000;
    }
}
