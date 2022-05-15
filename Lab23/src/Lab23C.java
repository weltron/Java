/*
 * Lab Assignment 23C Sorting
 * Weltron Bitange
 * This program uses Bubble Sort to sort through an array of objects
 * */
import java.util.*;
import java.io.*;
public class Lab23C {
    public static void main(String[] args) throws IOException {
        // Declare Scanner to read from file
        Scanner input = new Scanner(new File("Lab23C.txt"));
        // Declare array of 5 items
        Software[] software = new Software[5];
        int i = 0;
        // Read the input file
        while (input.hasNextLine()) {
            String title = input.nextLine();
            double price = Double.parseDouble(input.nextLine());
            int rating = Integer.parseInt(input.nextLine());
            //Insert contents to array
            software[i++] = new Software(title, price, rating);
        }
        // Calling the sorting methods
        priceSort(software);
        rateSort(software);
    }
    // Sort in order of prices
    public static void priceSort(Software[] software){
        for (int i = 0; i < software.length; i++) {
            for (int j = 0; j < software.length - 1; j++) {
                if (software[j].getPrice() > software[j + 1].getPrice()) {
                    Software temp = software[j];
                    software[j] = software[j + 1];
                    software[j + 1] = temp;
                }
            }
        }
        // Display array
        System.out.println("Sort according to Price: ");
        for (Software item : software)
            System.out.println(item);
        System.out.println();
    }
    // Sort in order of ratings
    public static void rateSort(Software[] software){
        for (int i = 0; i < software.length; i++) {
            for (int j = 0; j < software.length - 1; j++) {
                if (software[j].getRating() > software[j + 1].getRating()) {
                    Software temp = software[j];
                    software[j] = software[j + 1];
                    software[j + 1] = temp;
                }
            }
        }
        // Display array
        System.out.println("Sort according to Ratings: ");
        for (Software item : software)
            System.out.println(item);
        System.out.println();
    }

}
// Software class
    class Software {
        private final String title;
        private final double price;
        private final int rating;

        public Software(String title, double price, int rating) {
            this.title = title;
            this.price = price;
            this.rating = rating;
        }

        public double getPrice() {
            return price;
        }

        public int getRating() {
            return rating;
        }

        @Override
        public String toString() {
            return "Title: " + title + ", Price: " + price + ", Rating: " + rating;
        }
    }
