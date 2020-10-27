package MOOC;

import java.util.Scanner;

public class BreakAndContinue {
    public static void main (String[] args){
        // create scanner
        Scanner reader = new Scanner(System.in);
        // condition
        while (true){
            System.out.println("Enter positive number: ");
            int number = Integer.valueOf(reader.nextLine());
            if(number == 0){
                break;
            }else if(number < 0){
                System.out.println("Unfit number! Try Again");
                continue;
            }
            System.out.println(number+ " ");
        }
        System.out.println();
    }
}
