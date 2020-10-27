package MOOC;

import java.util.Scanner;

public class PrintNum {
    public static void main (String[] args){
        // create scanner
        Scanner reader = new Scanner(System.in);
        System.out.println("enter your number: ");
        int number = reader.nextInt();
        while (true){
            number = number+1;
            if(number >= 5){
                break;
            }
            if(number < 5){
                continue;
            }
            System.out.println(number + " ");
        }
        System.out.println(number + " ");
    }
}
