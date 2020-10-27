package MOOC;

import java.util.Scanner;

public class CountNumber3 {
    public static void main (String[] args){
        // this task is to give input from user
        Scanner reader = new Scanner(System.in);
        // this task count how many time enter 1
        int ones = 0;
        // this task hanlde and exitted program
        while (true){
            // this taks with user enter number or exit
            System.out.println("enter number (0 for exit): ");
            // this task is to read number from user
            int number = Integer.valueOf(reader.nextLine());
            // this task stop
            if (number == 0){
                break;
            }
            if (number > 0){
                ones = ones + number;
            }
        }
        System.out.println("The total number ones :"+ones);
    }
}
