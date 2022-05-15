/*
 * This program creates a hash table of customer names and customer ID numbers using linear probing
 * */

import java.io.*;
import java.util.*;

public class Lab27A {
    public static void main(String[] args) throws IOException {
        Customer [] customers = new Customer[10];
        int hashVal;
        Scanner input = new Scanner(new File("Lab27A.txt"));

        while((input.hasNextLine())){
            String array [] = input.nextLine().split(" ", 2);
            hashVal = hash(Integer.parseInt(array[0]));
            System.out.println(hashVal + array[1]);

            int x = hashVal;
            do {
                if(customers[x] == null){
                    customers[x] = new Customer(Integer.parseInt(array[0]), array[1]);
                    break;
                }
                x = (x + 1) % 10;
            } while (x != hashVal);
        }
        for(int i = 0; i < 10; i++) {
            if(customers[i] != null) {
                System.out.print("\n" + i + " ");
                System.out.print(customers[i]);
            }
        }
    }

     public static int convertKey(int key){
        int sum = 0;

        while (key != 0){
            sum += key % 10;
            key /= 10;
        }
        return sum;
     }

     public static int hash(int iD){
        int hashVal = convertKey(iD);

        while (hashVal >= 10){
            hashVal = convertKey(hashVal);
        }
        return hashVal;
     }
}

class Customer{
    int customerId;
    String name;

    public Customer(int customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    public int getCustomerId() {
        return customerId;
    }

    @Override
    public String toString() {
        return "Customer ID: " + customerId + ", Customer name: " + name + '\n';
    }
}
