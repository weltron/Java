/*
 * Lab Assignment 25A Binary Search Trees
 * Weltron Bitange
 * This program creates a tree node class and uses it to build a binary search tree
 * */

import java.util.*;
import java.io.*;
public class Lab25A {
    public static void main(String [] args) throws IOException {
        BinarySearchTree binSearch = new BinarySearchTree();

        Scanner input = new Scanner(new File("Lab25A.txt"));

        while (input.hasNextInt()) {
            binSearch.insert(input.nextInt());
        }

        System.out.print("Enter a value to search in list: ");
        Scanner userInput = new Scanner(System.in);
        int searchBST = userInput.nextInt();

        if(binSearch.search(searchBST) == true)
            System.out.println(searchBST +" is an item in tree \n");
        else
            System.out.println(searchBST +" is not an item in tree \n");

        binSearch.inOrderPrint(binSearch.root);
    }
}

class TreeItem{
    int value;
    TreeItem left;
    TreeItem right;

    public TreeItem(int value) {
        this.value = value;
        left = null;
        right = null;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "The Tree contains: " + value;
    }
}

class BinarySearchTree{
    TreeItem root;

    public BinarySearchTree() {
        this.root = null;
    }

    public boolean insert(int x){
        if (root == null)
            root = new TreeItem(x);
        else{
            TreeItem current = root;
            while (current != null){
                if(current.getValue() == x)
                    return false;
                else if(current.getValue() > x)
                {
                    if(current.left == null)
                    {
                        current.left = new TreeItem(x);
                        break;
                    }
                    else
                        current = current.left;
                }
                else
                {
                    if(current.right == null)
                    {
                        current.right = new TreeItem(x);
                        break;
                    }
                    else
                        current = current.right;
                }
            }
        }
        return true;
    }
    public boolean search(int x){
        TreeItem current = root;
        while (current != null){
            if (x < current.getValue())
                current = current.left;
            else if (x > current.getValue())
                current = current.right;
            else
                return true;
        }
        return false;
    }
    public void inOrderPrint(TreeItem root) {
        if (root != null)
        {
            inOrderPrint(root.left);
            if(root.left != null && root.right != null)
                System.out.println(root.value + " - has 2 children");
            else if(root.left != null || root.right != null)
                System.out.println(root.value + " - has 1 child");
            else
                System.out.println(root.value + " - has no children");
            inOrderPrint(root.right);
        }

    }

}