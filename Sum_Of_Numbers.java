package MOOC_week2;
/* Implement a program which calculates the sum of a closed interval,
and prints it. Expect the user to write the smaller number first and then the larger number.
You can base your solution to this exercise to the solution of last exercise — add the functionality
for the user to enter the starting point as well.
 */

import java.util.Scanner;

public class SumOfNum2 {
    public static void main (String[] args){
        // this task is to input data from user
        Scanner reader = new Scanner(System.in);
        // ask the user enter first number
        System.out.print("Enter First Number: ");
        // this task is to read user input
        int first = Integer.valueOf(reader.nextLine());
        // ask the user enter last number
        System.out.print("Enter Last Number: ");
        int last = Integer.valueOf(reader.nextLine());
        // declare sum variable
        int sum = 0;
        // use for loop
        for(int i = first; i <= last; i++){
            sum = sum + i;
        }
        System.out.println("The sum is: "+sum);

    }
}
