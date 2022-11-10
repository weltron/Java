import java.util.*;
public class CarLoan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the annual interest rate in percentage: ");
        double annualInterest = input.nextDouble();
        double monthlyInterest = annualInterest / 1200;
        System.out.print("Enter the loan amount: ");
        double loan = input.nextDouble();
        System.out.print("Enter the number of years: ");
        int years = input.nextInt();

        double monthlyPay = (loan * monthlyInterest) / (1 - ( 1 / Math.pow(1 + monthlyInterest, years * 12)));
        System.out.println("Monthly Payments are: " + monthlyPay);
        double totalPay = monthlyPay * years * 12;
        System.out.println("Total Payment is: " + totalPay);
    }
}
