/*
 * This program that creates and processes an ArrayList of Strings and Doubles.
 * It reads from a file and stores it in an array list and then outputs the details of books.
 * */
import java.io.*;
import java.util.*;
//main class
public class LAB19B {
    public static void main(String []args) throws IOException {
        //declare arraylist for books
        ArrayList<Book>books = new ArrayList<>();
        //read input from file
        Scanner input = new Scanner(new File("Lab19B.txt"));
        //loop through the file
        while (input.hasNext()){
            String title = input.nextLine();
            String author = input.nextLine();
            int pages = input.nextInt();
            String blank = input.nextLine(); //to skip to next line after reading int
            //add to book object
            books.add(new Book(title, author, pages));
        }
        //declaring variables
        double avgPages, sumPages = 0;
        //loop to calculate the sum of the pages
        for (int i = 0; i < books.size(); i++){
            sumPages += books.get(i).getPages();
        }
        //calculate the average number of pages for all books
        avgPages = sumPages / (double) books.size();
        System.out.println("The average number of pages is: " + avgPages);
        //display the book details
        System.out.println("\nBooks Information: ");

        for (int i = 0; i < books.size(); i++){
            System.out.println(books.get(i)); //calling the toString method from Book class
        }
    }
}

//the Book class
class Book{
    //declaring variables
    private String title;
    private String author;
    private int pages;
    // constructor for Book
    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }
    // int method that returns the number of pages
    public int getPages() {
        return pages;
    }
    // a string method that returns the title
    public String getTitle() {
        return title;
    }
    // a to string method that returns the variables with labels
    public String toString(){
        return "Title: " + title + ", Author: " + author + ", Pages: " + pages;
    }
}


