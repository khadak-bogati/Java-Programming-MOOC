package MOOC;

import java.util.Scanner;

public class SumOfNumber {
    public static void main (String[] args){
        // create Scanner
        Scanner reader = new Scanner(System.in);
        // declare variable your number
        int mynum = 0;
        int sum = 0;
        // create a condition
        while (true){
            if(mynum == 4){
                break;
            }
            // ask the user for input number
            System.out.println("Enter your number: ");
            int entNum = Integer.valueOf(reader.nextLine());
            sum = sum +entNum;
            mynum = mynum +1;

        }
        System.out.println("The sum of my number is: "+sum);
    }
}

