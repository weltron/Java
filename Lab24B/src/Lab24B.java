/*
 * This program creates a queue of car makes models and years and add and remove objects from the queue
 * */

import java.util.*;
import java.io.*;

public class Lab24B {
    public static void main(String [] args) throws IOException{
        String make, model;
        int year;
        MyQueue<Cars> carsMyQueue = new MyQueue<Cars>();

        Scanner input = new Scanner(new File("Lab24B.txt"));

        while (input.hasNext()){
            make = input.next();
            model = input.next();
            year = input.nextInt();

            Cars car = new Cars(make, model, year);
            carsMyQueue.enqueue(car);
        }

        System.out.println(carsMyQueue);

        System.out.println("The following vehicles have been sold:\n");

        Cars dequeue;
        dequeue = carsMyQueue.dequeue();
        System.out.println(dequeue);

        dequeue = carsMyQueue.dequeue();
        System.out.println(dequeue);

        dequeue = carsMyQueue.dequeue();
        System.out.println(dequeue);


    }
}

class Cars{
    String make;
    String model;
    int year;

    public Cars(String carMake, String carModel, int carYear){
        make = carMake;
        model = carModel;
        year = carYear;
    }

    public int getYear() {
        return year;
    }

    public String getMake() {
        return make;
    }

    @Override
    public String toString() {
        return  "Make: " + make + '\n' + "Model: " + model + '\n' + "Year: " + year + '\n' ;
    }
}

class MyQueueNode<E>{
    E car;
    MyQueueNode next;

    public MyQueueNode(E inCar){
        car = inCar;
        next = null;
    }
    public E getCar(){
        return car;
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
    public void enqueue(E car){
        MyQueueNode<E> node = new MyQueueNode<>(car);

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
            return temp.car;
        }
    }

    public String toString(){
        String s = "Vehicle Inventory\n\n";
        MyQueueNode current = head;

        while (current != null){
            s = s + current.car + "\n";
            current = current.next;
        }
        return s;
    }

}
