/*
 * This program that creates and processes an ArrayList of Strings and Doubles.
 * It reads from a file and stores it in an array list and then outputs the details of books.
 * */
import java.io.*;
import java.util.*;
public class LAB19C {
    public static void main(String [] args){
        //initialize and fill two arrays
        String[] firstArr = new String[]{"Kenya", "Tanzania", "Uganda", "Rwanda", "Burundi"};
        Double[] secondArr = new Double[]{3.14, 16.34, 6.32, 9.02, 11.58};
        //call printlist method
        printList(firstArr);
        printList(secondArr);
        System.out.print("\n");
        //print out largest element for each array with label
        System.out.println("The largest element in the String array is: " + getLargest(firstArr));
        System.out.println("The largest element in the Double array is: " + getLargest(secondArr));
        System.out.print("\n");
        //print out index of the largest element for each array with label
        System.out.println("The index of the largest element in the String array is: " + getLargestIndex(firstArr));
        System.out.println("The index of the largest element in the Double array is: " + getLargestIndex(secondArr));
    }

    public static <E> void printList(E [] arr){
        //for loop to iterate through the array
        for (int i = 0; i < arr.length; i++){
            // print array with " - " in between elements except the last one
            if (i == arr.length - 1)
                System.out.print(arr[i]);
            else
                System.out.print(arr[i]+ " - ");
        }
        System.out.print("\n");
    }
    public static <E extends Comparable <E>> E getLargest(E [] arr){
        //initializing the largest element to the first element in the array
        E largest = arr[0];
        //loop through array to find largest element
        for (int i = 0; i < arr.length; i++){
            //compare each element with the current largest
            if (arr[i].compareTo(largest) > 0)
                largest = arr[i];
        }
        return largest;
    }
    public static <E extends Comparable <E>> int getLargestIndex(E [] arr){
        //initializing the largest element to the first element in the array and largest index to -1
        E largest = arr[0];
        int largest_index = -1;
        //looping though the elements of the array
        for (int i = 0; i < arr.length; i++){
            //compare each element with the current largest
            if (arr[i].compareTo(largest) > 0) {
                largest = arr[i];
                largest_index = i;
            }
        }
        return largest_index;
    }
}
