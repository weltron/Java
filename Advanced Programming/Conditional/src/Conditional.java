
import javax.swing.JOptionPane;
import java.util.Scanner;
public class Conditional {
    public static void main (String [] args){

        Scanner input = new Scanner(System.in);
        System.out.println("What percentage is your phone? ");
        int battery = input.nextInt();

        if (battery >= 100){
            System.out.println("Unplug your phone");
        }
        else if (battery <= 50){
            System.out.println("Plug in your phone ");
        }
        else{
            System.out.println("All Okay!");
        }
    }
}
