import java.util.*;
public class CoinChange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount in decimal: ");
        double amount = input.nextDouble();
        int remainingAmount = (int)(amount * 100);
        int dollars = remainingAmount / 100;
        remainingAmount %= 100;
        int quarters = remainingAmount / 25;
        remainingAmount %= 25;
        int dimes = remainingAmount / 10;
        remainingAmount %= 10;
        int nickels = remainingAmount / 5;
        remainingAmount %= 5;
        int pennies = remainingAmount;

        System.out.println("The amount has " + dollars + " dollars, " + quarters + " quarters, " + dimes + " dimes, " + nickels + " nickels, " + pennies + " pennies.");

    }
}
