package org.example;

public class ClickerCounterTester {
    public static void main(String[] args) {
        ClickerCounter c1 = new ClickerCounter();
        System.out.println(c1.getNumClicks());
        c1.click();
        c1.click();
        System.out.println(c1.getNumClicks());

        ClickerCounter c2 = new ClickerCounter(42);
        System.out.println(c2.getNumClicks());
        c2.click();
        c2.click();
        System.out.println(c2.getNumClicks());
        c2.click(10);
        System.out.println(c2.getNumClicks());
        System.out.println(c2.fancyFormat());

        System.out.printf("The count for c1 is %d, and the count for c2 is %06d", c1.getNumClicks(), c2.getNumClicks());
    }
}
