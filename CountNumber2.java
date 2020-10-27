package MOOC;

import java.util.Scanner;

public class CountNumber2 {
    public static void main (String[] args){
        Scanner reader = new Scanner(System.in);
        while (true){
            int ones = 0;
            System.out.println("Enter Number: (exit 0): ");
            int number = reader.nextInt();
            if(number == 0){
                break;
            }
            if (number == 1){
                ones = ones + 1;
            }
            System.out.println("the total number of ones = "+ones);
        }
    }

    }

