/*
 * This program creates and processes a Stack of Books and determining how many pages we read in a challenge
 * */
import java.util.*;
import java.io.*;
public class Lab20B {
    public static void main (String [] args) throws IOException{
        //Declare Stack of books
        Stack<Book>books = new Stack<>();
        //Read from file
        Scanner input = new Scanner(new File("Lab20B_alternate.txt"));
        //loop through the file
        while (input.hasNext()){
            String title = input.nextLine();
            String author = input.nextLine();
            int pages = Integer.parseInt(input.nextLine());

            //add book to stack
            Book book = new Book(title, author, pages);
            books.push(book);
        }
        //Declare iterator to print put the books
        Iterator iterate = books.iterator();
        while (iterate.hasNext())
            System.out.println(iterate.next());
        System.out.println();

        //call the readBooks method and pass the stack as input
        readBooks(books);

        //run the iterator to determine how many books remain in the stack
        System.out.println("Books remaining in Stack: ");
        //we call the iterator one more time
        iterate = books.iterator();
        while (iterate.hasNext())
            System.out.println(iterate.next());
        System.out.println();

    }
    //void method to determine book reading challenge
    public static void readBooks(Stack<Book>books){
        //
        System.out.println("The number of objects in the stack is: \n" + books.size());
        System.out.println("\nBooks Read in Challenge: ");
        int pagesRead = 0;
        //loop the number of pages read
        while(books.size() > 0 && pagesRead < 600){
            Book book = (Book) books.pop();
            System.out.println(book);
            pagesRead += book.getPages();
        }
        System.out.println("Total pages read : " + pagesRead + "\n");
    }
}

class Book {
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
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Pages: " + pages;
    }
}
