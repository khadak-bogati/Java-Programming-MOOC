package MOOC;
/* Write a program that reads an integer from the user. If the number is less than 0, the program prints
the given integer multiplied by -1. In all other cases, the program prints the number itself. A few examples
of how the program's expected to function are shown below:

 */
import java.util.Scanner;

public class AbsultNum {
    public static void main (String[] args){
        // creating scanner
        Scanner reader = new Scanner(System.in);
        // ask user inter your number here
        System.out.println("Enter your Number: ");
        int num = Integer.valueOf(reader.nextLine());
        if(num < 0){
           System.out.println( num = (num * (-1)));
        }else{
           System.out.println(num);
        }
    }
}
