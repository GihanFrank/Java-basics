
// This program decides whether the user input is a perfect number or not
//NAME - Gihan Jayasundara Arachchige
//STUDENT ID - 20170705
//DATE - 30-05-2022
import java.util.*;

public class Lab3P2 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int userValue = (int) k.nextInt();

        int i = 1;
        int a = 0;
        int b = 0;

        while (i <= userValue) {
            if (userValue % i == 0) {
                a = b;
                b = i + a;

            }
            i++;

        }

        if (userValue * 2 == b) {
            System.out.println(userValue + " is a Perfect Number");
        } else {
            System.out.println(userValue + " is not a Perfect Number");
        }
    }

}
