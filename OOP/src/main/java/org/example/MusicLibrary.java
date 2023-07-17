package org.example;

import java.util.ArrayList;

public class MusicLibrary {
    //a collection of songs
    //title
    //artist
    //duration
    //album
    //genre

    private ArrayList<Song> collection;
    private Song favorite;

    public MusicLibrary(){
        collection = new ArrayList<Song>();
        favorite = null;
    }

    public void addSong(Song s){
        collection.add(s);
        if(favorite == null){
            favorite = s;
        }
    }

    public void addSong(String title, String artist){
        Song s = new Song(title, artist);
        collection.add(s);
        if(favorite == null){
            favorite = s;
        }
    }

    public void addSong(String title, String artist, String album, String genre, int duration){
        Song s = new Song(title, artist, album, genre, duration);
        collection.add(s);
        if(favorite == null){
            favorite = s;
        }
    }

    public ArrayList<Song> getCollection(){
        return collection;
    }

    public Song getFavorite(){
        if (favorite == null){
            System.out.println("You haven't set a favorite!");
            return null;
        }
        return favorite;
    }

    public ArrayList<Song> grabLoveSongs(){
        ArrayList<Song> loveSongs = new ArrayList<Song>();
        //need to consider every song
        for (Song currentSong : collection) {
            //determine: is it a love song?
            String title = currentSong.getTitle();
            //if the title has the word love in it
            if (title.toLowerCase().contains("love")) {
                //->we need to save it
                loveSongs.add(currentSong);
            }
        }
        return loveSongs;
    }


}
