/*
 * Lab Assignment 24C Implementing Linked Lists, Stacks & Queues
 * Weltron Bitange
 * This program creates a stack of drinks and add and remove objects from the stack
 * */

import java.util.*;
import java.io.*;
public class Lab24C {
    public static void main(String[] args) throws IOException {
        String name, container;
        int drinkSize;
        MyStack<Drinks> drinkStack = new MyStack<Drinks>();

        Scanner input = new Scanner(new File("Lab24C.txt"));

        while (input.hasNext()) {
            name = input.next();
            container = input.next();
            drinkSize = input.nextInt();

            Drinks drinks = new Drinks(name, container, drinkSize);
            drinkStack.push(drinks);
        }
        System.out.println(drinkStack);

        System.out.println("The following drink are no longer available:\n");

        Drinks pop;
        pop = drinkStack.pop();
        System.out.println(pop);

        pop = drinkStack.pop();
        System.out.println(pop);

    }
}

    class Drinks {
        String name;
        String container;
        int drinkSize;

        public Drinks(String drinkName, String drinkContainer, int drinkSizes) {
            name = drinkName;
            container = drinkContainer;
            drinkSize = drinkSizes;
        }

        @Override
        public String toString() {
            return "Name: " + name + '\n' + "Container: " + container + '\n' + "Size: " + drinkSize + '\n';
        }
    }

    class MyNode<E> {
        E drink;
        MyNode next;

        public MyNode(E inDrink) {
            drink = inDrink;
            next = null;
        }

        public E getDrink() {
            return drink;
        }
    }

    class MyStack<E> {
        MyNode<E> top;
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
        public void push(E drink) {
            MyNode<E> node = new MyNode<>(drink);
            node.drink = drink;
            node.next = top;
            top = node;
        }

        //remove node at the beginning of stack
        public E pop() {
                MyNode<E> temp = top;
                top = top.next;
                size--;
                return temp.drink;

        }

        public String toString() {
            String s = "Drinks available\n\n";
            MyNode current = top;

            while (current != null) {
                s = s + current.drink + "\n";
                current = current.next;
            }
            return s;
        }
}