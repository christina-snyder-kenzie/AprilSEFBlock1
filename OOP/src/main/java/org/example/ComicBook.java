package org.example;

public class ComicBook {
    //state (attributes)
    /*
    numPages
    condition
    title
    issue/volume
    author
    colors
    superheroes?
    number of pages read
     */
    private String title, author;
    private int totalNumPages, currentPage, issue;

    public ComicBook(String title, String author, int totalNumPages, int currentPage, int issue){
        this.title = title;
        this.author = author;
        this.totalNumPages = totalNumPages;
        this.currentPage = currentPage;
        this.issue = issue;
    }

    public ComicBook(String title, String author, int totalNumPages, int issue){
        this.title = title;
        this.author = author;
        this.totalNumPages = totalNumPages;
        this.currentPage = 1;
        this.issue = issue;
    }

    //You've read xx / yy pages in title, issue nn, written by author
    public void displayInfo(){
        //System.out.println("You've read " + currentPage + "/" + totalNumPages + " pages");
        System.out.printf("You are on %d/%d pages in %s, issue %d, written by %s\n", currentPage, totalNumPages, title, issue, author);
    }


    //behaviors
    /*
    flip the pages
    read text
    create/buy it
    know if we're finished
    collectDust
    inspire
     */

    public void read(){
        //flip the page (increase currentPage)
        //make a sentence (Turning from page x to page y)
        //Turning to the next page, page Y
        currentPage++;
        System.out.println("Turning to the next page, page " + currentPage);
    }

    //miniGoal: write a method that will tell me if I'm finished?
    public boolean isFinished(){
        return currentPage >= totalNumPages;
        //1 != 205 (that is a true statement, even though I'm NOT finished)
    }

    //GOAL: write a method that simulates binge reading
        //keep reading until the book is finished!
    /*
        while(!isFinished()){
            keep reading()
        }
        say congrats! you did it
     */
    public void devourBook(){
        while (!isFinished()){
            read();
            try {
                Thread.sleep(500);
            } catch (Exception e){
                System.out.println("Something went wrong");
            }
        }
        System.out.println("CONGRATS, You read " + title);
    }

}
