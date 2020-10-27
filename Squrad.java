package MOOC;

import java.util.Scanner;

public class Squrad {
    public static void main (String[] args){
        // creating scanner
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = Integer.valueOf(reader.nextLine());
        // declear result
        int squared = num * num;
        System.out.println("the Squred of "+num+ " is = "+squared);
    }
}
