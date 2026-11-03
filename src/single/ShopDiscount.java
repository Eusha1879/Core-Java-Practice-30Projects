package single;
import java.util.Scanner;
public class ShopDiscount {
public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    double totalBill = 0;
    int choice = 0;
    System.out.println("⌚ Welcome to the Rico Watch Shop! ⌚");
    while(choice != 5 ){
        System.out.println("\nSelect an item to add your cart ");
        System.out.println("1. Rolex Replica - 50$ ");
        System.out.println("2. Omega Clone - 44$ ");
        System.out.println("3. Seiko Pro - 62");
        System.out.println("4.Casio classic - 20$");
        System.out.println("5. Checkout & pay");
        System.out.println("Your choice write below :  ");

        choice = sc.nextInt();
        if(choice == 1){
            totalBill = totalBill+50;
            System.out.println("Added Rolex Replica. Current Bill: $ " + totalBill);
        }else if(choice == 2){
            totalBill = totalBill + 44;
            System.out.println("Added Omega Clone. Current Bill: $ " + totalBill);
        }else if(choice == 3){
       totalBill = totalBill + 62;
            System.out.println("Added Seiko Pro. Current Bill: $ " + totalBill);
        }else if(choice == 4){
       totalBill = totalBill + 20;
            System.out.println("Added Casio Classic. Current Bill: $ " + totalBill);
        }else if(choice == 5){
            System.out.println("🛒 Proceeding to checkout...");
        }else{
            System.out.println("❌ Invalid choice, try again.");
        }
// Checkout er por discount apply korar main rule
        System.out.println("\n--- Final Bill ---");
        System.out.println("Original Total: €" + totalBill);
    if (totalBill >= 100){
        double discountamount = totalBill * 0.10;
        double finalamount = totalBill - discountamount;
        System.out.println(" Congrats! You got a 10% discount.");
        System.out.println("Final ammount " + finalamount + "euro" );
    }else{
        System.out.println("you're total checkout price " +totalBill + " euro ");
    }

    }
}
}
