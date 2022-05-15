/*
 * Lab Assignment 28A Implementing Data Structures
 * Weltron Bitange
 * This program creates an array of cities and adds the objects to a queue
 * */
import java.io.*;
import java.util.*;

public class Lab28A {
    public static void main(String[] args) throws IOException {
        //creating a City object
        MyQueue<City> cityMyQueue = new MyQueue<>();
        // scanner to read from text
        Scanner input = new Scanner(new File("Cities.txt"));
        //creating an array to hold the objects from file
        City [] cities = new City[10];
        int i = 0;
        // reading file and adding filess to array
        while(input.hasNext()){
            String name = input.next();
            String county = input.next();
            int ID = Integer.parseInt(input.next());

            cities[i++] = new City(name, county, ID);
        }
        //printing the array
        System.out.println("Unsorted list of cities");
        for (City city: cities) {
            System.out.println(city);
        }
        //calling the sort method
        insertSort(cities);
        // adding the objects to the queue
        for (City city: cities) {
            cityMyQueue.enqueue(city);
        }
        //printing the queue
        System.out.println(cityMyQueue);

    }
    // Insertion Sort Method to sort the array
    public static void insertSort(City[] cities){
        // a for loop to loop through the array objects and sort them according to IDs
        for (int i = 0; i < cities.length; i++){
            City index = cities[i];
            int j;
            for (j = i - 1; j >= 0 && cities[j].getID() > index.getID(); j--){
                cities[j + 1] = cities[j];
            }
            cities[j + 1] = index;
        }
    }
}

// city class to create cities with names counties and county IDs
class City{
    String name;
    String county;
    int ID;

    public City(String name, String county, int ID) {
        this.name = name;
        this.county = county;
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    @Override
    public String toString() {
        return "City Name: " + name + ", County: " + county + ", ID: " + ID;
    }
}

//myqueuenode class to make create a node for the queue
class MyQueueNode<E>{
    E city;
    MyQueueNode next;

    public MyQueueNode(E inCity){
        city = inCity;
        next = null;
    }
    public E getCity(){
        return city;
    }
}

class MyQueue<E>{
    MyQueueNode head;
    MyQueueNode<E> tail;
    int size;

    public MyQueue(){
        head = null;
        tail = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty(){
        if (size == 0)
            return true;
        else
            return false;
    }

    //adding node to the end of the queue
    public void enqueue(E city){
        MyQueueNode<E> node = new MyQueueNode<>(city);

        if (tail == null)
            head = tail = node;
        else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    //remove node at the beginning of queue
    public E dequeue(){
        if(size == 0) //if list is empty
            return null;
        else { //if list is not empty
            MyQueueNode<E> temp = head;
            head = head.next;
            size--;
            if(head == null)
                tail = null;
            return temp.city;
        }
    }
    //toString method to print out the queue of cities
    public String toString(){
        String s = "\nA Queue of Cities in Counties\n";
        MyQueueNode current = head;

        while (current != null){
            s = s + current.city + "\n";
            current = current.next;
        }
        return s;
    }

}

