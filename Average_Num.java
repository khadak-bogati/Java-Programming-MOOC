package MOOC;
/* Write a program that asks the user for input until the user inputs 0.
After this, the program prints the average of the positive numbers (numbers that are greater than zero).
 If no positive number is inputted, the program prints "Cannot calculate the average"

 */

import java.util.Scanner;

public class Average_Num {
    public static void main (String [] args){
        // this task is to input data
        Scanner reader = new Scanner(System.in);
        // this task count total
        int total = 0;
        int average = 0;
        int total_numbers = 0;
        int positive_numbers = 0;
        int negative_numbers = 0;
        int sum_negative = 0;
        int average_negative = 0;
        int sum_positive_num = 0;
        int average_positive =0;

        // this task is to handle and stop program
        while (true){
            // this task is to ask user input number
            System.out.println("Enter Number, (0 for exit): ");
            // this task is to read user input
            int number = Integer.valueOf(reader.nextLine());
            // this task stop programe
            if(number == 0){
                break;
            }
            // this task is to valid number
            if(number > 0 ){
                positive_numbers = positive_numbers + 1;
                sum_positive_num = sum_positive_num + number;
                average_positive = sum_positive_num/positive_numbers;

            }
            if (number < 0){
                negative_numbers = negative_numbers +1;
                sum_negative = sum_negative+number;
                average_negative = sum_negative/negative_numbers;

            }
            total_numbers = negative_numbers + positive_numbers;
            total = ((sum_negative) + sum_positive_num);
            average = total/total_numbers;
        }
        System.out.println("Total numbers = "+total_numbers);
        System.out.println("average of positive numbers = "+average_positive);
        System.out.println("Average of negative numbers = "+average_negative);
        System.out.println("Sum of total numbers = "+total);
        System.out.println("Average of total number = "+average);

    }
}
