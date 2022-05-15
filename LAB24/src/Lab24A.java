/*
 * Lab Assignment 24A Implementing Linked Lists, Stacks & Queues
 * Weltron Bitange
 * This program creates a linked list of names and searches for a name from user input.
 * */
import java.util.*;
import java.io.*;

//main class
public class Lab24A {
    public static void main(String [] args) throws IOException{
        String name;
        MyLinkedList linkedList = new MyLinkedList();

        Scanner input = new Scanner(new File("Lab24A.txt"));

        while (input.hasNext()){
            name = input.nextLine();
            linkedList.addLast(name);
        }
        //print values of linked list
        System.out.println(linkedList);


        System.out.print("Enter a name to search in list: ");
        Scanner userInput = new Scanner(System.in);
        String searchName = userInput.nextLine();

        if(linkedList.inList(searchName))
            System.out.println(searchName + " is in the LinkedList");
        else
            System.out.println(searchName + " is not in the LinkedList");
    }

}


//mynode class
class MyNode{
    public String name;
    public MyNode next;

    public MyNode(String newname){
        name = newname;
        next = null;
    }
}

//linkedlist class
class MyLinkedList{
    MyNode head, tail;
    int size;

    public MyLinkedList(){
        head = null;
        tail = null;
        size = 0;
    }

    public void addLast(String newname){
        MyNode node1 = new MyNode(newname);

        if (tail == null)
            head = tail = node1;
        else{
            tail.next = node1;
            tail = tail.next;
        }
        size++;
    }

    public String getFirst(){
        return head.name;
    }

    public String getLast(){
        return tail.name;
    }
//to string method
    @Override
    public String toString() {
        String names = "The names in the Linked list are: \n";
        MyNode current = head;

        while (current != null){
            names = names + current.name + "\n";
            current = current.next;
        }
        return names;
    }

    //search method
    public boolean inList(String searchName){
        MyNode check = head;
        while(check != null) {
            if(check.name.compareTo(searchName)==0)
                return true;
            check = check.next;
        }
        return false;
    }
}