package MOOC;
/* Write a program that asks the user for numbers. If the number is negative (smaller than zero),
the program prints for user "Unsuitable number" and asks the user for a new number. If the number is zero,
the program exits the loop.
If the number is positive, the program prints the number to the power of two.
 */

import java.util.Scanner;

public class PositiveNum {
    public static void main (String[] args){
        // scanner
        Scanner reader = new Scanner(System.in);
        // control
        while (true){
            System.out.print("Enter your positive number: ");
            int number = Integer.valueOf(reader.nextLine());
            if(number < 0){
                System.out.println("Unsuitable number");
                continue;

            }
            if (number== 0){
                break;
            }
            if (number > 0){
                System.out.println(number= number * number);
            }
        }
    }
}
