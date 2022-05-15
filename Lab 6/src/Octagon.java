/*
 * An octagon class that extends the GeometricObject abstract class and uses it to calculate the area and perimeter. It usues the Cloneable and Comparable interfaces 
 */
public class Octagon extends GeometricObject implements Comparable <Octagon>, Cloneable {
	// Declaring a variable side to represent the side of the octagon
	private double side;
	
	//A no-arg constructor that creates an octagon with side 0
	public Octagon() {
		side = 0;
	}
	// A constructor to create an octagon with a specified side
	public Octagon(double side) {
		this.side = side;
	}
	// A getter method for side
	public double getSide() {
		return side;
	}
	//A setter method for side
	public void setSide(double side) {
		this.side = side;
	}
	//A getArea method to calculate the area of the octagon
	@Override
	public double getArea() {
		double area = (2 + 4 / Math.sqrt(2)) * side * side;
		return area;
	}
	//A getPerimeter method to calculate the perimeter of the octagon
	@Override
	public double getPerimeter() {
		double perimeter = 8 * side;
		return perimeter;
	}
	// Implementing the compareTo method
	@Override
	public int compareTo(Octagon o) {
		if (getArea() > o.getArea())
			return 1;
		else if (getArea() < o.getArea())
			return -1;
		else
			return 0;
	}
	//Override the protected clone method defined in the Object class, and strengthen its accessibility
	@Override 
	public Object clone(){
		try{
			return super.clone();
		}
		catch(CloneNotSupportedException e){
		      return null;
		}
	}	
}
