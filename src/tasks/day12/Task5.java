package tasks.day12;

import tasks.day12.task3.MusicArtist;
import tasks.day12.task3.MusicBand;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist(" Andrew A", 50));
        members1.add(new MusicArtist(" Billy B ", 35));
        members1.add(new MusicArtist(" Clint C ", 48));
        members1.add(new MusicArtist(" Dallon D ", 40));
        members1.add(new MusicArtist(" Eagle E ", 44));
        members1.add(new MusicArtist(" Frank F ", 20));

        MusicBand musicBand1 = new MusicBand(" Linkin ", 2010, members1);

        List<MusicArtist> members2 = new ArrayList<>();
        members2.add(new MusicArtist(" Gregory G ", 31));
        members2.add(new MusicArtist(" Hill H ", 29));
        members2.add(new MusicArtist(" Paul P ", 31));
        members2.add(new MusicArtist(" Ringo S ", 27));

        MusicBand musicBand2 = new MusicBand(" Limp ", 2020, members2);

        musicBand1.printMembers();
        musicBand2.printMembers();

        MusicBand.transferMembers(musicBand1,musicBand2);
        System.out.println();

        musicBand1.printMembers();
        musicBand2.printMembers();
    }
}
