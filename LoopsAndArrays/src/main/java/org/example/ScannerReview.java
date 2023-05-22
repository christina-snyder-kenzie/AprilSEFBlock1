package org.example;

import java.util.Scanner;

public class ScannerReview {
    public static void main(String[] args) {
        //1. Make the scanner
        //2. Prompt/ask for what you want
        //3. Retrieve their answer
        //2. Prompt/ask for what you want
        //3. Retrieve their answer
        //2. Prompt/ask for what you want
        //3. Retrieve their answer
        //2. Prompt/ask for what you want
        //3. Retrieve their answer

        //a^2 + b^2 = c^2
        //c = sqrt(a^2 + b^2)

        //Given, a and b (from the scanner) can we calculate c?

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a value for a:");
        String responseForA = scan.nextLine();
        double a = Double.parseDouble(responseForA);

        System.out.println("Enter a value for b:");
        double b = Double.parseDouble(scan.nextLine());

        double c = Math.sqrt(a*a + Math.pow(b, 2));
        System.out.println("C: " + c);

        //3 squared plus 4 squared equals 5;
        System.out.println(a + " squared plus " + b + " squared equals " + c);
    }
}
