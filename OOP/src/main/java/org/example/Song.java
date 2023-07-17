package org.example;

public class Song {
    //title
    //artist
    //duration
    //album
    //genre
    private String title, artist, album, genre;
    private int duration; //seconds?
    private boolean copyRighted;

    public Song(String t, String a, String al, String g, int duration){
        title = t;
        artist = a;
        album = al;
        genre = g;
        this.duration = duration;
        copyRighted = true;
    }

    public Song(String t, String a){
        title = t;
        artist = a;
        album = "unknown";
        genre = "unknown";
        duration = -1;
        copyRighted = false;
    }

    public String toString(){
        return title + " by " + artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getDuration() {
        if (duration == -1){
            System.out.println("ERROR: Data not found");
            return -1;
        }
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
