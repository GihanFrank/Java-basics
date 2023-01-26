
//  LAB01 - This program will print the type of the user inputs (User must enter exactly what the program asks for)
//  NAME - Gihan Jayasundara Arachchige
//  STUDENT NUMBER - 20170705
//  DATE - 17/05/2022
import java.util.*;

public class Lab01P3 {
    public static void main(String[] agrs) {

        var var = new Scanner(System.in);
        System.out.println("    Please enter a single Chararcter");
        char charValue = var.next().charAt(0);
        System.out.println("    Please enter an interger value");
        int intValue = var.nextInt();
        System.out.println("    Please enter a real number");
        double realNumber = var.nextDouble();

        System.out.println("\t" + charValue + " is a Character.");
        System.out.println("\t" + intValue + " is an integer.");
        System.out.println("\t" + realNumber + " is a real number.");
    }

}
