/*
 * This program creates and processes a queue of orders and processes orders and returns the list of items
 * available as well as a list of unprocessed orders
 * */
import java.io.File;
import java.io.IOException;
import java.util.*;

public class Lab20C {
    public static void main(String[] args) throws IOException {
        /*//declare queue
        Queue<Orders>ordersQueue = new ArrayDeque<>();
        //scanner to read form file
        Scanner input = new Scanner(new File("Lab20C.txt"));
        //loop through the file
        while (input.hasNext()) {
            String name = input.nextLine();
            int noOfWidgets = input.nextInt();
            String blank = input.nextLine(); //to jump to next line in file
            //add the input to the queue
            Orders object = new Orders(name, noOfWidgets);
            ordersQueue.add(object);
        }
        System.out.println("This is the queue: \n" + ordersQueue + "\n");
        //Call the widgets method
        widgets(50, ordersQueue);
        // A while loop to print the rest of the items in the queue
        System.out.println("\nItems in the current queue: ");
        while (!ordersQueue.isEmpty())
            System.out.println(ordersQueue.remove());
    }
    public static void widgets(int avail, Queue<Orders>ordersQueue){
        //Declare an iterator to iterate through queue
        Iterator<Orders>iterate = ordersQueue.iterator();
        System.out.println("Orders Processed: ");
        //run the iterator through a loop
        while (iterate.hasNext()){
            Orders order = iterate.next();
            //if statement to determine whether we have enough widgets to process orders and remove orders that have been processed already
            if(avail >= order.getNoOfWidgets()){
                System.out.println(order);
                avail -= order.getNoOfWidgets();
                iterate.remove();
            }
        }
        System.out.println("\nThe number of remaining available widgets is: \n" + avail + "\n");
        //Print out the rest of the queue
        System.out.println("The rest of the queue: \n" + ordersQueue);

         */
    }
}

class Orders{
    //instance variables
    private String name;
    private int noOfWidgets;
    //constructor
    public Orders(String name, int noOfWidgets) {
        this.name = name;
        this.noOfWidgets = noOfWidgets;
    }
    //int for widgets
    public int getNoOfWidgets() {
        return noOfWidgets;
    }
    //tostring to return results
    public String toString() {
        return  "Name: " + name + '\n' + "Number of Widgets Ordered: " + noOfWidgets + "\n";
    }
}
