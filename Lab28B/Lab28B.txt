/*
 * Lab Assignment 28B Implementing Data Structures
 * Weltron Bitange
 * This program creates an array of companies and adds the objects to a atack
 * */
import java.io.*;
import java.util.*;

public class Lab28B {
    //main method
    public static void main(String[] args) throws IOException{
        //stack declaration
        MyStack<Company> compStack = new MyStack<Company>();
        //scanner to read fromm file
        Scanner input = new Scanner(new File("Company.txt"));
        //read from file and add to stack
        while(input.hasNext()){
            String name = input.next();
            String country = input.next();
            int rank = Integer.parseInt(input.next());

            Company company = new Company(name, country, rank);
            compStack.push(company); //push method to add to stack
        }
        //print stack
        System.out.println(compStack);
        //pop method to remove the items from stack and print out in order they were added
        System.out.println("The list of companies in order: ");
        //for loop to pop items
        for (int i = 0; i < 10; i++) {
            Company pop = compStack.pop();
            System.out.println(pop);
        }
    }

}

// company classes
class Company{
    String name;
    String country;
    int rank;
//constructor
    public Company(String name, String country, int rank) {
        this.name = name;
        this.country = country;
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return "Company name: " + name + ", country: " + country + ", rank: " + rank;
    }
}

//Stack node class
class MyStackNode<E> {
    E company;
    MyStackNode next;

    public MyStackNode(E inCompany) {
        company = inCompany;
        next = null;
    }

    public E getCompany() {
        return company;
    }
}

//stack class
class MyStack<E> {
    MyStackNode<E> top;
    int size;

    public MyStack() {
        top = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        if (size == 0)
            return true;
        else
            return false;
    }

    //adding node to the top of the stack
    public void push(E company) {
        MyStackNode<E> node = new MyStackNode<>(company);
        node.company = company;
        node.next = top;
        top = node;
    }

    //remove node at the beginning of stack
    public E pop() {
        MyStackNode<E> temp = top;
        top = top.next;
        size--;
        return temp.company;

    }

    public String toString() {
        String s = "\nTop Ten Companies\n";
        MyStackNode current = top;

        while (current != null) {
            s = s + current.company + "\n";
            current = current.next;
        }
        return s;
    }
}
