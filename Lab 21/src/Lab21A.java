/*
 * This program creates and processes TreeSets and compares the values of each.
 * */
import java.util.*;
import java.io.*;
public class Lab21A {
    public static void main(String [] args) throws IOException{
        //Declare the Treesets
        TreeSet<String>grocery = new TreeSet<>();
        TreeSet<String>recipe1 = new TreeSet<>();
        TreeSet<String>recipe2 = new TreeSet<>();
        //Scanner to read the values from files
        Scanner input = new Scanner(new File("Lab21A1.txt"));
        //while loop to fill in grocery list from file
        while (input.hasNext()){
            String item = input.nextLine();
            grocery.add(item);
        }
        //scanner to read from the first recipe file
        input = new Scanner(new File("Lab21A2.txt"));
        //while loop to fill in first recipe from file
        while (input.hasNext()){
            String item = input.nextLine();
            recipe1.add(item);
        }
        //scanner to read from the second recipe file
        input = new Scanner(new File("Lab21A3.txt"));
        //while loop to fill in second recipe list from file
        while (input.hasNext()){
            String item = input.nextLine();
            recipe2.add(item);
        }
        //call the recipeCheck method
        recipeCheck(grocery, recipe1);
        recipeCheck(grocery, recipe2);
        //print remaining list
        System.out.print("The items remaining in the grocery list are: " + grocery);
    }
    //void method
    public static void recipeCheck(TreeSet<String>grocery, TreeSet<String>recipe){
        //check if groceries contains all items in the recipe
        if (grocery.containsAll(recipe)){
            System.out.println("The dish was made.");
            //list of items used
            System.out.println("The ingredients used are: " + recipe + "\n");
            //remove all items
            grocery.removeAll(recipe);
        }
        else{
            System.out.println("This dish was not made.");
            //remove all available items
            recipe.removeAll(grocery);
            //items missing from grocery list
            System.out.println("The items missing are: " + recipe + "\n");
        }
    }
}
