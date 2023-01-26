
// This program will ask the user to enter the month and program decised the name of the month
//NAME - Gihan Jayasundara Arachchige
//STUDENT ID - 20170705
//DATE - 24-05-2022

import java.util.*;

public class Lab2P4 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Please enter the month: ");
        int monthValue = (int) a.nextInt();

        switch (monthValue) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid month");
        }
    }

}
