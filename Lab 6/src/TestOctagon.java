/*
 * A test program that creates an octagon object with side value 5 and displays its area and perimeter as well as comparing with its clone
 */

public class TestOctagon {
		//Main method that throws an exception if clone is not supported
		public static void main(String[] args) throws CloneNotSupportedException{
			// Create an Octagon object with side 5
			Octagon octagon1 = new Octagon(5);

			// Display area and perimeter of object
			System.out.println("Area is " + octagon1.getArea() + "\nPerimeter is " + octagon1.getPerimeter());

			// Create new object using the clone method
			Octagon octagon2 = (Octagon)octagon1.clone();

			// Compare the two object using compareTo method
			System.out.println ("Compare the octagons 0");
			octagon1.compareTo(octagon2);
		
	}

}