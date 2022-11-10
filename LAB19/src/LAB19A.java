/*
 * This program that creates and processes an ArrayList of Strings. It returns words whose length is shorter than
 * user input.
 * */
import java.util.*;
import java.io.*;
public class LAB19A {
    public static void main(String [] args) throws IOException{
        //Declaring the arraylist
        ArrayList<String>list = new ArrayList<>();
        //Reading the words from the file using scanner
        Scanner input = new Scanner(new File("Lab19A.txt"));
        //while loop to read each line in the file and add it to the arraylist
        while(input.hasNext()){
            String file = input.next();
            list.add(file);
        }
        //invoking the void method
        wordLength(list);
    }
    public static void wordLength(ArrayList<String>list){
        Scanner inputNum = new Scanner(System.in);
        //Prompt user for word length input
        System.out.print("Enter length: ");
        int num = inputNum.nextInt();

        System.out.println("Here's a list of words whose length is less than " + num + " :");
        //for loop to search through the arraylist
        for (int i = 0; i < list.size(); i++){
            String word = list.get(i);
            // if statement to check if word is shorter than input in length
            if(word.length() < num)
                //display the words in a single line separated by a space
                System.out.print(word + " ");
        }
    }
}
