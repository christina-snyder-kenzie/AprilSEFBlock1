package org.example;

import java.util.ArrayList;

public class MusicLibraryTester {
    public static void main(String[] args) {
        MusicLibrary library = new MusicLibrary();
        System.out.println(library.getFavorite());
        library.addSong("9 to 5", "Dolly Parton");
        library.addSong("Can't help falling in love", "Elvis");
        library.addSong("Masterpiece", "Motion", "The end of the world", "Metal", 210);
        System.out.println(library.getCollection());
        System.out.println(library.getFavorite());
        Song track = new Song("New Shoes", "Paolo");
        library.addSong(track);
        library.addSong("LoVe gets me every time", "Shania Twain");

        library.addSong("Secret love song", "Little mix");

        ArrayList<Song> loveSongs = library.grabLoveSongs();
        System.out.println(loveSongs);



    }
}
