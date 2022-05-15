//A java Program that takes input from users and determines if the input can make up a triangle then calculates the area and perimeter of the triangle
import java.util.Scanner;
//The public class
public class Assign5 {
    //main method
   public static void main (String[] args){
       //scanner for input
       Scanner input  = new Scanner(System.in);
       //while loop to repeat program
       while(true){
           //prompt user for input
           System.out.print("\nEnter 3 line lengths: ");
           int a = input.nextInt();
           int b = input.nextInt();
           int c = input.nextInt();
            // conditional statements to determine if user input can make up a triangle
               if(a == 0 || b == 0 || c == 0 ){
                   System.out.println("\nHasta la vista!"); //if any value is 0 then program terminates program
                   return;
               }
               else if((a + b) > c && (b + c) > a && (a + c) > b){
                   Triangle t1 = new Triangle(a, b, c); //instantiate triangle object if input makes up a triangle
                   System.out.printf("Triangle perimeter is " +  t1.getPerimeter() + ", area is %.3f %n", t1.getArea());
                   }
               else{ //if not a triangle tell user and have them enter new values
                   System.out.println("Lines cannot form a triangle");
               }
       }
   }
}
//the triangle class
class Triangle{
    //private fields to store the lengths
    private int a;
    private int b;
    private int c;
// a constructor for triangle
    Triangle(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;

    }
//getter method for side a
    public int getA() {
        return a;
    }
//setter method for side a
    public void setA(int a) {
        this.a = a;
    }
//getter method for side b
    public int getB() {
        return b;
    }
//setter method for side b
    public void setB(int b) {
        this.b = b;
    }
//getter method  for side c
    public int getC() {
        return c;
    }
//setter method for side c
    public void setC(int c) {
        this.c = c;
    }
    //getPerimeter method that returns perimeter of the triangle
    public int getPerimeter(){
        return (a + b + c);
    }
    //getArea method that returns the area of the triangle
    public double getArea(){
        float s = (a + b + c)/2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return area;
    }

}
