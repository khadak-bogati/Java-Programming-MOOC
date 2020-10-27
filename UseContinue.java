package MOOC;

import java.util.Scanner;

public class UseContinue {
    public static void main (String[] args){
        // create scanner
        Scanner reader = new Scanner(System.in);
        while (true){
            System.out.println("Please enter positive number: ");
            int number = Integer.valueOf(reader.nextLine());
            if(number<0){
                System.out.println("Unfit number! please enter positive number:");
                continue;
            }
            System.out.println("your Enter : "+number);
        }
    }
}
