package MOOC;
/* Write a program, according to the preceding example, that asks the user to input values
 until they input the value 4.
 */

import java.util.Scanner;

public class WhileLoop3 {
    public static void main (String[] args){
        // create scanner
        Scanner reader = new Scanner(System.in);
        // create control condition
        while (true){
            System.out.println("enter 4 for quit: ");
            int input = Integer.valueOf(reader.nextLine());
            if (input == 4){
                break;
            }
        }

    }
}
