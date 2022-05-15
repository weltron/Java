//A Java program that determine if lines are perpendicular or not using their slope
import java.util.*;
public class Mathlines {
	public static void main(String[] args) {
		
		//ask user to input values for line1
		System.out.print("Enter line1 coordinates(x1, y1, x2, y2): ");
		
		//declare scanner for input coordinates for line1
		Scanner line1 = new Scanner(System.in);
		int x1 = line1.nextInt();
		int y1 = line1.nextInt();
		int x2 = line1.nextInt();
		int y2 = line1.nextInt();
		
		//call function m
		if(x2 - x1 == 0)
			System.out.print("Lines are perpendicular");;
		int m1= ((y2 - y1) / (x2 - x1));
		
		// ask user to input values for line2
		System.out.print("Enter line2 coordinates(x3, y3, x4, y4): ");
		
		//declare scanner for input coordinates for line1
		Scanner line2 = new Scanner(System.in);
		int x3 = line2.nextInt();
		int y3 = line2.nextInt();
		int x4 = line2.nextInt();
		int y4 = line2.nextInt();
		
		//call function m
		if(x4 - x3 == 0)
			System.out.print("Lines are perpendicular");;
		int m2 = ((y4 - y3) / (x4 - x3));
		
		//checking for divide by zero
	
		
		//conditional statement to determine whether or not lines are perpendicular
		if((x1 == x2 && y3 == y4) || (x3 == x4 && y2 == y1))
			System.out.print("Lines are perpendicular");
		else if((m2 * m1) == -1){    
		    System.out.print("Lines are perpendicular");
		    }
		else{
		    System.out.print("Lines are not perpendicular");
		    }
	}
}