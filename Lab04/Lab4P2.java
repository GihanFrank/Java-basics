
// This program gives least common multiplier
//NAME - Gihan Jayasundara Arachchige
//STUDENT ID - 20170705
//DATE - 06-06-2022
import java.util.*;

public class Lab4P2 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println(" Please enter the first value : ");
        int m = (int) x.nextInt();
        System.out.println("Please enter the second value : ");
        int n = (int) x.nextInt();
        System.out.println("LCM is "+lcm(m, n));

    }
    public static int gcd(int a, int b){
        int reminder=a%b;
        if(reminder==0){
            return b;
        }
        else{
            return gcd(b, reminder);
        }
    }
    public static int lcm(int a, int b){
        int lcm= (a*b)/gcd(a, b);
        return lcm;
    }

}
