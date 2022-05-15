/*
 * This program creates and processes an ArrayList of random numbers and processes the list.
 * */
import java.util.*;
import java.io.*;
public class Lab20A {
    public static void main(String [] args){
        //Declare ArrayList
        ArrayList<Integer>list = new ArrayList<Integer>();
        //Populate arraylist with random numbers
        Random randomMethod = new Random();
        //loop to add numbers to arraylist
        for (int i = 0; i < 20; i++){
            list.add(randomMethod.nextInt(101));
        }
        //calling the first void method
        originalList(list);
        //calling and printing the second method
        System.out.println ("\n\nThe average of the items in the arraylist is: \n" + avgList(list));
        //sort the list
        Collections.sort(list);
        System.out.println("\nHere is the sorted list: ");
        for(int number : list)
            System.out.print(number + " ");

    }
    public static void originalList(ArrayList<Integer>list){
        //Print the original list
        System.out.println("The original list includes: ");
        //Remove the braces from the arraylist
        for(int number : list)
            System.out.print(number + " ");
        //Declaring and cloning list1
        ArrayList<Integer>list1 =  (ArrayList<Integer>)list.clone();
        //Declaring list2
        ArrayList<Integer>list2 = new ArrayList<Integer>(Arrays.asList(0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100));

        if(list1.contains(50))
            System.out.println("\n\nList1 contains 50.");
        else
            System.out.println("\n\nList1 does not contains 50.");
        //Remove all items of list2 from list1
        ArrayList<Integer> l1 = (ArrayList<Integer>)(list1.clone());
        l1.removeAll(list2);
        //Print new list1
        System.out.println("\nThis is list1 with all the items in list 2 removed: ");
        for(int number : l1)
            System.out.print(number + " ");
    }

    public static int avgList(ArrayList<Integer> list){
        int sum = 0;
        //Declare iterator
        Iterator<Integer> iterate = list.iterator();
        //loop through list and get sum
        while(iterate.hasNext()){
            sum += iterate.next();
        }
        return sum / list.size();
    }

}
