// This program will ask the user to enter a vlue and the program will decide whether the user value equal, less than or greater than zero.
//NAME - Gihan Jayasundara Arachchige
//STUDENT ID - 20170705
//DATE - 24-05-2022

import java.util.*;

public class Lab2P2 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Please Enter a non-decimal value = ");
        int userVlue = (int) a.nextInt();

        if (userVlue == 0) {
            System.out.println("The value is equal to Zero.");
        } else if (userVlue < 0) {
            System.out.println("The value is less than Zero.");

        } else {
            System.out.println("The value is greater than Zero.");
        }

    }
}
