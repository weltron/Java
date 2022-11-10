/*
 * This program accepts a string and searches for and displays
 * the longest set of increasing letters
 * */
import java.util.*;
public class Lab22B {
    public static void main(String [] args){
        //declare scanner to read input from user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string here: ");
        String stringInput = input.next();
        //calling method and displaying result
        System.out.println("The longest possible substring is: \n" + string(stringInput));

        System.out.println("\nThe time complexity is O(n).");
    }
    public static String string (String S){
        //declare int to determine length of the string
        int n = S.length();
        //declare temporary holders for a substrings
        StringBuilder temp = new StringBuilder();
        String display = "";

        System.out.println("The possible substrings are as follows: ");
        //loop through the string
        for (int i = 0; i < n-1; i++){
            //determine if the current character is less than the next one
            if(S.charAt(i) < S.charAt(i+1))
                temp.append(S.charAt(i));
            else{
                temp.append(S.charAt(i));
                //determining if the length of the temporary substring is larger than the one in the return string
                if (temp.length() > display.length()){
                    display = temp.toString();
                    System.out.println(display);
                }
                else{
                    System.out.println(temp);
                }
                temp = new StringBuilder(" ");
            }
        }
        //return the substring
        return display;
    }
}
