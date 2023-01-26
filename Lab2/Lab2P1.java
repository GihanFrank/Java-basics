// This program will ask the user to enter angle in digrees and the output will be cos and sin values of the user input.
//NAME - Gihan Jayasundara Arachchige
//STUDENT ID - 20170705
//DATE - 24-05-2022

import java.util.*;

public class Lab2P1 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Please enter the angle in degrees: ");
        double enterDegree = a.nextDouble();
        double radianAngle = enterDegree * (Math.PI / 180);
        double cosValue = Math.cos(radianAngle);
        double sinValue = Math.sin(radianAngle);
        System.out.println("Cosine Value of the Angle = " + cosValue);
        System.out.println("Sine Vale of the Angle = " + sinValue);
    }
}
