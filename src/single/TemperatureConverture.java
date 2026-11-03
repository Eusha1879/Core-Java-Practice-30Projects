package single;
import java.util.Scanner;
public class TemperatureConverture
{
public static void main(String [] args){
    int choice;
    double temperature;
    double result;


    Scanner sc = new Scanner(System.in);
    System.out.println("\n ==== Temperature Converter ==== ");
    System.out.println("1.Celsius to Fahrenheit");
    System.out.println("2. Fahrenheit to Celsius");
    System.out.println("= Enter your Choice (1 or 2)");
    choice = sc.nextInt();

    if (choice == 1){ // Celcius to Fahrenheit
        System.out.println("Enter Temperature in Celcius");
        temperature = sc.nextDouble();
        result = (temperature * 9/5)+32;
        System.out.println(temperature + " ^C  = " + result + " ^  F  " );
    } else if (choice == 2) {
        System.out.println("Enter Temperature in Fahrenheits");
        temperature = sc.nextDouble();
        result  = (temperature - 32 )*5/9;
        System.out.println(temperature + "^F  = " + result + "^C ");

    }else{
        System.out.println("Invalid Choice ! Please Enter 1 or 2 ");
    }
    sc.close();

}
}
