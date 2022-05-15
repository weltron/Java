/*
 * This program creates a Treemap from an input file and checks for values from user input.
 * */
import java.util.*;
import java.io.*;
public class Lab21C {
    public static void main(String [] args)throws IOException{
        //declare treemap
        Map<String, Integer> treeMap = new TreeMap<>();
        //declare scanner to read from file
        Scanner input = new Scanner(new File("Lab21C.txt"));
        while (input.hasNextLine()){
            String name = input.nextLine();
            int score = input.nextInt();
            String blank = input.nextLine();//skips to the next line
            //add data to treemap
            treeMap.put(name,score);
        }
        //Print out the data in treemap
        System.out.println("The Treemap has the consists of: ");
        treeMap.forEach((name, score) -> System.out.print("Name: " + name + "\nScore: " + score + "\n"));
        //prompt user to enter name to search
        System.out.print("Enter a name: ");
        //declare scanner to take input from user
        Scanner inputName = new Scanner(System.in);
        String nameSearch = inputName.nextLine();
        //find if name entered is in map and give user feedback
        if (treeMap.containsKey(nameSearch))
            System.out.println(nameSearch + " is contained in the map.");
        else
            System.out.println(nameSearch + " is not contained in the map.");
        //prompt user to enter a score value
        System.out.print("Enter score: ");
        int scoreSearch = inputName.nextInt();
        int count = 0;
        //loop to search how many teams scored more than user value
        for(Map.Entry<String, Integer> treeMapSearch : treeMap.entrySet()){
            if(treeMapSearch.getValue()>=scoreSearch)
                count++;
        }
        //print out how many teams scored more than entered value.
        System.out.println(count + " teams scored " + scoreSearch + " or higher.");
    }
}
