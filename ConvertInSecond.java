package MOOC;

import java.util.Scanner;

public class ConvertInSecond {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("How many days do you want to convert in second: ");
        int days = Integer.valueOf(input.nextLine());
        int seconds = days * 24 * 60 * 60;
        System.out.println(days +" day have total seconds: "+seconds);
        int first = 10;
        int second = first + 5;
        first = 20;
        System.out.println(first);

    }
}
