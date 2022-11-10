/*
 * This program creates a hash table of gadget names and gadget ID numbers using quadratic probing
 * */

import java.io.*;
import java.util.*;
public class Lab27B {
    public static void main(String[] args) throws IOException {
        Gadget [] gadgets = new Gadget[20];
        int hashVal;
        Scanner input = new Scanner(new File("Lab27B.txt"));

        while((input.hasNextLine())){
            String array [] = input.nextLine().split(" ", 2);
            hashVal = hash(Integer.parseInt(array[0]));
            System.out.println(hashVal + array[1]);

            int x = hashVal;
            int j = 1;
            do {
                if(gadgets[x] == null){
                    gadgets[x] = new Gadget(Integer.parseInt(array[0]), array[1]);
                    break;
                }
                x = (x + (j * j)) % 20;
                j += 1;
            } while (x != hashVal);
        }
        for(int i = 0; i < 20; i++) {
            if(gadgets[i] != null) {
                System.out.print("\n" + i + " ");
                System.out.print(gadgets[i]);
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

class Gadget{
    int gadgetID;
    String gadgetName;

    public Gadget(int gadgetID, String gadgetName) {
        this.gadgetID = gadgetID;
        this.gadgetName = gadgetName;
    }

    public int getGadgetID() {
        return gadgetID;
    }

    @Override
    public String toString() {
        return "Gadget Id: " + gadgetID + ", Gadget Name: " + gadgetName;
    }
}
