// a program that calculates the raise an employee gets over the course of the next for years given their current salary

import java.util.Scanner;
public class AnnualRaise {

	public static void main(String[] args) {

		//create a scanner for user input
		Scanner input = new Scanner(System.in);
		//ask user to enter salary amount
		System.out.print("Enter a salary: ");
		
		//declaration of variables
		double salary = input.nextDouble();
		double raise;
		int MAX_YEAR = 4;
		int MAX_RAISE = 5;
		double newSal = salary;
		
		
		while(salary >= 0) {
			//conditional statement that allows program to terminate when user inputs 0
			if (newSal == 0) {
				System.out.println("Good bye!");
				System.exit(0);
			}
			else {
				//outer loop to increment raise rate by 1
				for(int raiseRate = 3; raiseRate <= MAX_RAISE; raiseRate++) {
					salary = newSal;
					System.out.println("Raise rate: " + raiseRate + "%");
					//inner loop to increment year and calculate values 
					for(int year = 1; year <= MAX_YEAR; year++) {
						raise = (salary * (raiseRate * 0.01));
						salary += raise;
						// display values formatted into two decimal places 
						System.out.printf("         Year: " + year + ", Raise: $%.2f" + ", Salary: $%.2f \n" , raise , salary);
					}
				}
				//prompt user to enter new amount for calculation 
				System.out.print("Enter a salary: ");
				newSal= input.nextDouble();
			} 
		}
	}
}