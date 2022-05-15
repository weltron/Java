import java.util.Scanner;
import java.io.*;

public class Scores {
	//throw an exception in the main method
	public static void main(String[] args) throws FileNotFoundException{
		// using try catch to handle an exception
		try {
			//invoke a scanner method to read from file
			Scanner input = new Scanner(new File("src/scores.csv"));
			
			//print the header of the output console
			System.out.printf("%-50s%-25s%-11s%-6s \n", "Name", "Scores", "Average", "Grade");
			System.out.printf("%-32s%-40s%10s%9s \n", "-----------------------", "--------------------------------------", "-------", "-----");
			//a while loop to read lines of data until end of file
			while(input.hasNextLine()) {
				//have the data stored in an array for easier manipulation and split the data at each comma
				String [] scoreArr = input.nextLine().split(",");
				//convert the scores from string to int
				int score1 = Integer.valueOf(scoreArr[1]);
				int score2 = Integer.valueOf(scoreArr[2]);
				int score3 = Integer.valueOf(scoreArr[3]);
				int score4 = Integer.valueOf(scoreArr[4]);
				int score5 = Integer.valueOf(scoreArr[5]);
				//find the average of the scores and convert them from int to double
				double average = (double)(score1 + score2 + score3 + score4 + score5)/5;
				
				//finding the grade of the student using if-else conditional statements
				char grade;
				if (average >= 90){
			        grade = 'A';
			    }else if (average >= 80){
			        grade = 'B';
			    }else if (average >= 70){
			        grade = 'C';
			    }else if (average >= 60){
			        grade = 'D';
			    }else
			    	grade = 'F';
				//print out results to console
				System.out.printf("%-32s%3d%9d%9d%9d%8d%11.1f%8c \n", scoreArr[0], score1, score2, score3, score4, score5, average, grade);
			}
			input.close(); //close file after we are done with it
		}
		//catch a filenotfoundexception when the file is not found
		
		catch(FileNotFoundException e){
			System.out.println("Error opening input file");
			System.exit(0); //exit if exception is met
			
		}
		System.exit(0);//exit program
	}
}
