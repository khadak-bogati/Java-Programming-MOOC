package MOOC;

import java.util.Scanner;

public class SquredSum {
    public static void main (String[] args){
        // creating scanner
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your fist number: ");
        int num1 = Integer.valueOf(reader.nextLine());

        double squrtNum1 = Math.sqrt(num1);
        System.out.println("Enter your second number: ");
        int num2 = Integer.valueOf(reader.nextLine());
        double squrtNum2 = Math.sqrt(num2);
        int result = (int)squrtNum1 + (int)squrtNum2;
        System.out.println(result);

    }
}

