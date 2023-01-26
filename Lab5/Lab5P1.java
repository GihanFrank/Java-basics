// This program asks the user to enter a word and returns the number of vowels.
//NAME - Gihan Jayasundara Arachchige
//STUDENT ID - 20170705
//DATE - 14-06-2022

import java.util.*;

public class Lab5P1 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter a Word : ");
        String ui = a.nextLine();
        char[] word = ui.toCharArray();

        System.out.println("Number of Vowels :" + countVovel(word));
    }

    public static int countVovel(char[] b) {
        int count = 0;
        for (int i = 0; i < b.length; i++) {
            if (b[i] == 'a' || b[i] == 'i' || b[i] == 'o' || b[i] == 'u' || b[i] == 'e') {
                count++;
            }
        }
        return count;
    }

}
