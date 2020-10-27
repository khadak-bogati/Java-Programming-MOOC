package MOOC;
/* Write a program that reads values from the user until they input a 0. After this,
the program prints the total number of inputted values. The zero that's used to exit the 4
loop should not be included in the total number count.

 */

import java.util.Scanner;

public class NumberOfNumbers {
    public static void main (String[] args){
        // this task is to input from user
        Scanner reader = new Scanner(System.in);
        // this task count of numbers
        int numbers = 0;
        // this task handle and exit
        while (true){
            // this task ask user input number or exit
            System.out.print("Enter Number, (0 exit): ");
            // this task is to read number from user
            int number = Integer.valueOf(reader.nextLine());
            // this task stop
            if (number == 0){
                break;
            }
            if(number > 0){
                numbers = numbers +1;
            }
        }
        System.out.println("Number of Numbers: "+numbers);
    }

}
