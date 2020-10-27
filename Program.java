package MOOC;

import java.util.Scanner;

public class Program {
    public static void main (String[] args){
        // creating Scanner
        Scanner reader = new Scanner(System.in);
        System.out.print("enter your number: ");
        // example of different type of input
        String text = reader.nextLine();
        int number = Integer.valueOf(reader.nextLine());
        double numWithDecimal = Double.valueOf(reader.nextLine());
        boolean trueORFalse = Boolean.valueOf(reader.nextLine());
        int result = number * 5;
        System.out.println(result);
    }
}
