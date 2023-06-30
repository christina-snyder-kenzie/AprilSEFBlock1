package org.example;

public class BookTester {
    public static void main(String[] args) {
        ComicBook b1 = new ComicBook("Deadpool", "David Lapham", 205, 7);
        b1.displayInfo();
        b1.read();
        b1.read();
        b1.devourBook();
    }
}
