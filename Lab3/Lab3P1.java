
// This program asks the user to enter a number (x), and again it asks the user to enter x times any values to add them as the final total.
//NAME - Gihan Jayasundara Arachchige
//STUDENT ID - 20170705
//DATE - 30-05-2022
import java.util.*;

public class Lab3P1 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("How Many Numbers Do you want to add together? ");
        int userNumber = (int) a.nextInt();
        int current = 0;
        int previous = 0;

        for (int i = 1; i <= userNumber; i++) {
            System.out.println("Enter the Number ");
            int add = (int) a.nextInt();
            current = previous;
            previous = add + current;
            System.out.println("Total = " + previous);

        }

        // System.out.println("Final total = "+previous);
    }

}
