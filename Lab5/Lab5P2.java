// This program asks the user to enter a word and program returns the odd and even characters seperately.
//NAME - Gihan Jayasundara Arachchige
//STUDENT ID - 20170705
//DATE - 14-06-2022


import java.util.*;

public class Lab5P2 {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        String a = new String();
        System.out.println("Please enter a name ");
        a = x.nextLine();

        System.out.println("odd and even Characters of " + a);
        printer(divideText(a));
    }

    public static String[] divideText(String x) {
        char[] whole = x.toCharArray();
        char[] odd = new char[x.length()];
        char[] even = new char[x.length()];

        for (int i = 0; i < whole.length; i++) {
            odd[i] = whole[i];
            i++;
        }
        for (int i = 1; i < whole.length; i++) {
            even[i] = whole[i];
            i++;
        }

        String[] finals = new String[4];
        String odds = new String(odd);
        String evens = new String(even);
        for (int i = 0; i < x.length(); i++) {
            finals[0] = "ODD= ";
            finals[2] = " || EVEN= ";
            finals[1] = odds;
            finals[3] = evens;

        }
        return finals;

    }

    public static void printer(String[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

}
