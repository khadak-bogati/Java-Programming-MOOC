package MOOC;

import java.util.Scanner;

public class CountNumber {
    public static void main (String[] args){
        // this task read input from user
        Scanner reader = new Scanner(System.in);
        // this task is to repeat the block until block is exitted
        while (true){
            // this task count the number of ones
            int ones = 0;
            // this task ask the user input
            System.out.println("Input Number, (0 for exit: ");
            // this task is to read input from user
            int number = Integer.valueOf(reader.nextLine());
            // this task is to exit if user has inputted 0
            if (number == 0){
                break;
            }
            // this task increase the amoutn of one
            // if the user input one
            if(number ==1){
                ones = ones + 1;
            }
        }
        // this taks to print out total of num
        // but it doesn't work because the variable one has been intruduce inside loop
        System.out.println("The total of onese = ");
    }
}
