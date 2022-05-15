// A program that fills an array with random lower case letters of the alphabet and then searches for a user's query of a specific value and returns its position in the array
import java.util.Scanner;
public class Main{
	
// main method
	public static void main (String [] args) {

		// declare a new array alpha and initializing it to 50
		char[] alpha = new char[50];
		//a loop to fill in the array with random lower case chars
		for (int i = 0; i < alpha.length; i++) {
			//Math.random function is what we use to generate random values for the array then we convert them to char data type
			alpha[i] = (char)('a' + Math.random() * ('z' - 'a' + 1));
			// a conditional statement to print only 10 chars in a line
		     if ((i + 1) % 10 == 0)
		       System.out.println(alpha[i]);
		     else
		         System.out.print(alpha[i]);
		 }
		Scanner input = new Scanner(System.in);
		
		//prompt user to enter char for look up
		System.out.print("\n\nEnter a lowercase letter to lookup: ");
		char ch = input.next().charAt(0);
		
		// verify if user input is a lower case letter using a while loop and a isLowerCase method
		while(!Character.isLowerCase(ch)){
            //if the char is not lower case print error message
            System.out.print("Invalid input: '" + ch + "' is not a lower case letter");
           
            //again prompt the user to enter char for look up
            System.out.print("\n\nEnter a lowercase letter to lookup: ");
            ch = input.next().charAt(0);
        }
        
        //calling the search method
        int result = searchChar(alpha, ch);
        
        //if the method returns -1 which means the char is not in the array we tell the user the char is not found
        if(result == -1)
            System.out.println("Character '" + ch + "' is not in the array");
 
        else 
            System.out.println("Character '" + ch + "' is in the array at position " + result);
		
	}
	// a method to search the position of a char in an array
	public static int searchChar (char[] alpha, char ch) {
		//a loop to iterate through the array searching for user char
		for(int i = 0; i < alpha.length; i++) {
			
			//conditional statement to return the index value in the array when the char has been found
			if(alpha[i] == ch)
				return i;
		}
		// when char has not been found default return value is -1
		return -1;
	}
}
