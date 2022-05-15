/*
 * This program creates a binary search tree with string and uses
 * methods to fill and print
 * */

import java.util.*;
import java.io.*;

public class Lab25B {
    public static void main(String [] args) throws IOException {
        BinarySearchTree tree = new BinarySearchTree();
        Scanner input = new Scanner(new File("Lab25B.txt"));

        while (input.hasNextLine()) {
            tree.insert(input.nextLine());
        }

        System.out.println("The tree has " + tree.getSize() + " items.");
        System.out.print("\nThe tree sorted inorder: ");
        tree.inorder(tree.root);
        System.out.print("\nThe tree sorted preorder: ");
        tree.preorder(tree.root);
        System.out.print("\nThe tree sorted postorder: ");
        tree.postorder(tree.root);


    }
}

class TreeItem{
    String value;
    TreeItem left;
    TreeItem right;

    public TreeItem(String value) {
        this.value = value;
        left = null;
        right = null;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }
}

class BinarySearchTree{
    TreeItem root;
    int size;

    public BinarySearchTree() {
        this.root = null;
        size = 0;
    }

    public boolean insert(String names){
        if (root == null)
            root = new TreeItem(names);
        else{
            TreeItem current = root;
            while (current != null){
                if(current.value.compareTo(names) == 0)
                    return false;
                else if(current.value.compareTo(names) > 0)
                {
                    if(current.left == null)
                    {
                        current.left = new TreeItem(names);
                        break;
                    }
                    else
                        current = current.left;
                }
                else
                {
                    if(current.right == null)
                    {
                        current.right = new TreeItem(names);
                        break;
                    }
                    else
                        current = current.right;
                }
            }
        }
        size++;
        return true;
    }
    public boolean search(String names){
        TreeItem current = root;
        while (current != null){
            if (current.value.compareTo(names) > 0)
                current = current.left;
            else if (current.value.compareTo(names) < 0)
                current = current.right;
            else
                return true;
        }
        return false;
    }
    public void inorder() {
        inorder(root);
    }

    /** Inorder traversal from a subtree */
    protected void inorder(TreeItem root) {
        if (root == null)
            return;
        inorder(root.left);
        System.out.print(root.value + " ");
        inorder(root.right);
    }

    public void postorder() {
        postorder(root);
    }

    /** Postorder traversal from a subtree */
    protected void postorder(TreeItem root) {
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.value + " ");
    }

    public void preorder() {
        preorder(root);
    }

    /** Preorder traversal from a subtree */
    protected void preorder(TreeItem root) {
        if (root == null) return;
        System.out.print(root.value + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public int getSize() {
        return size;
    }
}
