package MOOC;

import java.util.Scanner;

public class Program2 {
    public static void main (String[] args){

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your number: ");

        int number = Integer.valueOf(reader.nextLine());

        int result = number * 2;

        System.out.println(result);
    }
}
