package MOOC_week2;
/* Implement a program which calculates the factorial of a number given by the user.
Factorial of n, denoted n!, is calculated as 1 * 2 * 3 * ... * n.
For example, the factorial of 4 is 24 or 4! = 1 * 2 * 3 * 4 = 24. Additionally,
it has been specified that the factorial of 0 is 1, so 0! = 1.

Sample output:

Sample output
Give a number: 3
Factorial: 6
 */

import java.util.Scanner;

public class Factorial {
    public static void main (String[] args){
        // this task is to input from user
        Scanner reader = new Scanner(System.in);
       // this task aks user for input
       System.out.print("Enter your Number: ");
        // this task is to read user input
        int number = Integer.valueOf(reader.nextLine());
        // declar factriol variable
        int factorial = 1;
        // for loop
        for(int i = 1; i<=number; i++){
            factorial = factorial * i;
        }
        System.out.println("Factorial = "+factorial);

    }
}
