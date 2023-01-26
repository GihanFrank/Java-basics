
//  LAB01 - This program will print the basic arthmatic operations of two voltages
//  NAME - Gihan Jayasundara Arachchige
//  STUDENT NUMBER - 20170705
//  DATE - 17/05/2022

import java.util.*;

public class Lab01P4 {
    public static void main(String[] args) {
        var var = new Scanner(System.in);

        System.out.println("    Please Enter the first voltage measurement (Interger Values only)");
        int firstVoltage = (int) var.nextInt();
        System.out.println("    Please Enter the second voltage measurement (Integer Values Only)");
        int secondVoltage = (int) var.nextInt();

        int sum = firstVoltage + secondVoltage;
        int sub = firstVoltage - secondVoltage;
        double div = firstVoltage / secondVoltage;
        int mul = firstVoltage * secondVoltage;
        int rem = firstVoltage % secondVoltage;

        System.out.println(" Sum of the Voltages = " + firstVoltage + "V + " + secondVoltage + "V = " + sum + "V");
        System.out.println(" Difference of the Voltages = " + firstVoltage + "V - " + secondVoltage + "V = " + sub + "V");
        System.out.println(" Product of the Voltages = " + firstVoltage + "V x " + secondVoltage + "V = " + mul + "V");
        System.out.println(" Quotient of the Voltages = " + firstVoltage + "V / " + secondVoltage + "V = " + div + "V");
        System.out.println(" Remainder of the Voltages = " + firstVoltage + "V % " + secondVoltage + "V = " + rem + "V");
    }

}
