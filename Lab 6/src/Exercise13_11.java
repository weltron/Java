/*
 * A test program that creates an octagon object with side value 5 and displays its area and perimeter as well as comparing with its clone
 */

public class Exercise13_11{
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

/*
 * An octagon class that extends the GeometricObject abstract class and uses it to calculate the area and perimeter. It usues the Cloneable and Comparable interfaces 
 */
class Octagon extends GeometricObject implements Comparable <Octagon>, Cloneable {
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

abstract class GeometricObject {
  private String color = "white";
  private boolean filled;
  private java.util.Date dateCreated;

  /** Construct a default geometric object */
  protected GeometricObject() {
    dateCreated = new java.util.Date();
  }

  /** Construct a geometric object with color and filled value */
  protected GeometricObject(String color, boolean filled) {
    dateCreated = new java.util.Date();
    this.color = color;
    this.filled = filled;
  }

  /** Return color */
  public String getColor() {
    return color;
  }

  /** Set a new color */
  public void setColor(String color) {
    this.color = color;
  }

  /** Return filled. Since filled is boolean,
   *  the get method is named isFilled */
  public boolean isFilled() {
    return filled;
  }

  /** Set a new filled */
  public void setFilled(boolean filled) {
    this.filled = filled;
  }

  /** Get dateCreated */
  public java.util.Date getDateCreated() {
    return dateCreated;
  }

  @Override
  public String toString() {
    return "created on " + dateCreated + "\ncolor: " + color +
      " and filled: " + filled;
  }

  /** Abstract method getArea */
  public abstract double getArea();

  /** Abstract method getPerimeter */
  public abstract double getPerimeter();
}