// This program asks the user to enter an array of words and program returns if any of the words are repeated.
//NAME - Gihan Jayasundara Arachchige
//STUDENT ID - 20170705
//DATE - 14-06-2022
import java.util.*;

public class Lab5P3 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String[] a = new String[5];
        for (int k = 0; k <= 4; k++) {
            System.out.println("Please Enter Names");
            a[k] = x.nextLine();

        }
        counter(a);

    }

    public static void counter(String[] c) {
        int count = 0;
        int i = 0;
        while (i <= 4) {
            for (int j = 0; j <= 4; j++) {
                if (c[i].equals(c[j])) {
                    count++;
                }
            }
            i++;
        }
        if (count > 5) {
            System.out.println("Match found ");
            for (int k = 0; k < c.length; k++) {
                System.out.print(c[k] + " ");
            }

        } else {
            System.out.println("No Match found !");
        }

    }

}
