/*
 * Lab Assignment 22A Algorithm Analysis
 * Weltron Bitange
 * This program creates an Arraylist and a TreeSet and compares the time it takes to fill,
 * search and remove a number from each
 * */
import java.util.*;
public class Lab22A {
    //main method
    public static void main(String [] args){
        //declaring the arraylist and treeset
        ArrayList<Integer>arrayList = new ArrayList<>();
        TreeSet<Integer>treeSet = new TreeSet<>();
        //calling the filllists methods
        fillLists(arrayList,treeSet);
        //print out the contents of the lists
        System.out.println("Here are the contents of the ArrayList: \n" + arrayList + "\n");
        System.out.println("Here are the contents of the TreeSet: \n" + treeSet + "\n");
        //calling the searchlists method
        searchLists(arrayList,treeSet);
    }
    //filllists method
    public static void fillLists(ArrayList<Integer>arrayList,TreeSet<Integer>treeSet) {
        //declare a random method
        Random random = new Random();
        //declare the timer
        long startTime = System.nanoTime();
        //loop to fill arraylist
        for (int i = 0; i < 1000; i++){
            arrayList.add(random.nextInt(2001));
        }
        long endTime = System.nanoTime(); //end timer
        //print out the time taken to fill
        System.out.println("It takes " + (endTime - startTime) + " nanoseconds to fill the ArrayList.\n");

        //start timer
        startTime = System.nanoTime();
        //loop to fill treeset
        for (int j = 0; j < 1000; j++){
            treeSet.add(random.nextInt(2001));
        }
        endTime = System.nanoTime(); //end timer
        //print out time taken to fill
        System.out.println("It takes " + (endTime - startTime) + " nanoseconds to fill the TreeSet.\n");
    }
    //search list method
    public static void searchLists(ArrayList<Integer>arrayList,TreeSet<Integer>treeSet){
        Scanner input = new Scanner(System.in);
        //ask user for input
        System.out.print("Enter a number between 1 and 2000 to search in array: ");

        int a = input.nextInt();
        System.out.println();
        //start timer and search for user input in list
        long startTime = System.nanoTime();
        if(arrayList.contains(a))
            System.out.println("The number " + a + " is contained in the ArrayList. \n");
        else
            System.out.println("The number " + a + " is not contained in the ArrayList. \n");
        long endTime = System.nanoTime();
        //print out how much time it took to search
        System.out.println("It took " + (endTime - startTime) + " nanoseconds to search through the ArrayList for the number " + a + ".\n");

        //start timer and search for user input in list
        startTime = System.nanoTime();
        if(treeSet.contains(a))
            System.out.println("The number " + a + " is contained in the TreeSet. \n");
        else
            System.out.println("The number " + a + " is not contained in the TreeSet. \n");
        endTime = System.nanoTime();
        //print out how much time it took to search
        System.out.println("It took " + (endTime - startTime) + " nanoseconds to search through the TreeSet for the number " + a + ".\n");
    }
}
