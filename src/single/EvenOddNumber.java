package single;
import java.util.Scanner;

public class EvenOddNumber {
    public static void main(String []args){
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter a number eg.= 1,2,3");
        number = sc.nextInt();

        if(number % 2 == 0){
            System.out.println("== The number is even == " );
            System.out.println(" Your input number is "+ number  );
        }else{
            System.out.println("The Number is Odd" );
            System.out.println(" Your input number is " + number);
            System.out.println(" if you want Even number please reEnter Different Number" );
        }
        sc.close();


    }
}
