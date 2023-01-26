
// This program asks the user to enter five numbers to save in an array and gives their sum, avaerage and the largest number.
//NAME - Gihan Jayasundara Arachchige
//STUDENT ID - 20170705
//DATE - 06-06-2022
import java.util.*;

public class Lab4P3 {
    public static void main(String[] args) {
        int[] a = new int[5];
        Scanner x = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.println("Please enter values : ");
            a[i] = (int) x.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println(" ");
        System.out.println("Sum of the numbers = " + sum(a));
        System.out.println(" ");
        System.out.println("Average of the total = " + average(a));
        System.out.println(" ");
        System.out.println("The largest number = " + findLargest(a));
    }

    public static int sum(int[] a) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < a.length; i++) {
            y = x + a[i];
            x = y;
        }
        return y;
    }

    public static int average(int[] a) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < a.length; i++) {
            y = x + a[i];
            x = y;
        }
        return y / a.length;
    }

    public static int findLargest(int[] b) {
        int k = 0;
        for (int i = 0; i < b.length; i++) {
            if (b[i] > k) {
                k = b[i];
            }
        }
        return k;
    }
}
