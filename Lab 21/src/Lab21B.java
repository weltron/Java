/*
 * Lab Assignment 21B Sets and Maps
 * Weltron Bitange
 * This program creates a Linkedhashmap from an input file and prints out a map
 * */
import java.util.*;
import java.io.*;
public class Lab21B {
    public static void main(String[] args) throws IOException{
        LinkedHashMap<Character, Integer>list  = new LinkedHashMap<>();
        Scanner input = new Scanner(new File("Lab21B.txt"));
        //iterating through each line in the file
        System.out.println("The items on the file are: ");
        while(input.hasNext()) {
            //splitting that file into words and saving to array
            String array[] =(input.nextLine().split(" "));
            //foreach loop to print words in a single line
            for (String Ar: array)
                System.out.print(Ar + " ");
            //iterating through each word using foreach loop
            for(String A:array) {
                list.put(A.charAt(0), list.getOrDefault(A.charAt(0), 0)+1);
            }
        }
        //print out contents of map
        System.out.println("\n\nThe map consists of: ");
        System.out.println(list);
    }
}