// (Math tutor) This program generates two random numbers and user has to enter the sum of those two numbers.
//NAME - Gihan Jayasundara Arachchige
//STUDENT ID - 20170705
//DATE - 30-05-2022

import java.util.*;

public class Lab3P3 {
    public static void main(String[] args) {
        int max = 10;
        int min = 1;

        int firstNumber = (int) Math.floor(Math.random() * (max - min + 1) + min);
        int secondNumber = (int) Math.floor(Math.random() * (max - min + 1) + min);
        Scanner a = new Scanner(System.in);
        int sumOfNumbers;
        int total;
        System.out.println(firstNumber + " + " + secondNumber);
        do {
            System.out.println("Please enter the correct answer");
            sumOfNumbers = (int) a.nextInt();
            total = firstNumber + secondNumber;

        } while (total != sumOfNumbers);
        System.out.println("Well done, " + total + " is the correct answer");

    }

}
