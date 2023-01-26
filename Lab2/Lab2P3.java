// This program will ask the user to enter his exam marks and the program will decide his grade.
//NAME - Gihan Jayasundara Arachchige
//STUDENT ID - 20170705
//DATE - 24-05-2022

import java.util.*;

public class Lab2P3 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Please enter your exam marks: ");
        int examMarks = (int) a.nextInt();

        if (examMarks >= 0 && examMarks <= 49) {
            System.out.println("F");
        } else if (examMarks >= 50 && examMarks <= 54) {
            System.out.println("D");
        } else if (examMarks <= 55 && examMarks <= 69) {
            System.out.println("C");
        } else if (examMarks >= 70 && examMarks <= 79) {
            System.out.println("B");
        } else if (examMarks >= 80 && examMarks <= 89) {
            System.out.println("A");
        } else if (examMarks >= 90 && examMarks <= 100) {
            System.out.println("A+");

        } else {
            System.out.println("InValid User input");

        }
    }
}
