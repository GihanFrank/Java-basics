// This program decides whether the user input is an odd number or even.
//NAME - Gihan Jayasundara Arachchige
//STUDENT ID - 20170705
//DATE - 06-06-2022

import java.util.*;

public class Lab4P1 {
    public static void main(String[] args){

        Scanner x=new Scanner(System.in);
        System.out.println("Please enter a value to check if it is an odd number : ");
        int userInput = (int)x.nextInt();
        
       System.out.println(isOdd(userInput));

    }

    public static boolean isOdd(int a){
        boolean answer = false;
        if(a%2==0){
          return answer; 
        }
        else{
            answer=true;
            return answer;
    } 
    
    }
    
}
