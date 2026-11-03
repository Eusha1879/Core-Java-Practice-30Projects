package single;
import java.util.Scanner;
public class LoanInterest {
public static void main(String [] args){
    /* interest Rule : Interest  = Pricipal * (Rate/100) * years
       Total Amount Rule : Total : Principal + Interest
   */
        double principalAmount;
        int years;

    Scanner sc = new Scanner (System.in);
    System.out.println("\n ==== Welcome To Rico Loan LTD ==== ");
    System.out.println("Interest Is fixed by Rico Loan LTD");
    System.out.println("1. Enter Amount You want For Loan.");
    principalAmount = sc.nextDouble();
    System.out.println("3. Enter How many years you want to proceed. ");

    years = sc.nextInt();
    final double interestRate = 13.2;
    double interest  = principalAmount * (interestRate/100)*years;
    double totalAmount  = principalAmount + interest ;

  System.out.println("\n === You're Loan Is granted ===");
    System.out.println("Our interest rate fixed within " + interestRate + " % ");
  System.out.println("You're total Interest rate for 5 year : "+ interest + " euro ");
    System.out.println("You have to pay as total amount : " + totalAmount + " euro ");

    sc.close();
}
}
