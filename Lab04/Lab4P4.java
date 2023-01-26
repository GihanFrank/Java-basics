// This program asks the user to enter a speed and time in hours to calculate the distance travelled in each hour.
//NAME - Gihan Jayasundara Arachchige
//STUDENT ID - 20170705
//DATE - 06-06-2022
import java.util.*;

public class Lab4P4 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter the Speed :");
        int speed = (int) a.nextInt();
        System.out.println("Enter the number of hours : ");
        int time = (int) a.nextInt();
        System.out.println("the distance traveled in each hour :");
        getdistance(speed, time);
    }

    public static void getdistance(int a, int b) {
        int k = 0;
        int l = 0;
        for (int i = 0; i <= b; i++) {
            l = a + k;
            k = l;
            System.out.print(l + " | ");
        }
    }

}
