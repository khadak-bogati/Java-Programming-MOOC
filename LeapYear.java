package MOOC;

import java.util.Scanner;

public class LeapYear {
    public static void main (String[] args){
        // create scanner object
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your year: ");

        // instialition user input number into year variable
        int year = input.nextInt();
        // declear that if input year less than 0 and more than 9999 use correce year
        if  (year <=0 || year > 9999){
            System.out.println("Enter corrcet number");

        } else if (year % 4 == 0 || year %100 == 0 || year %400 == 0){
            System.out.println("Leap Year");
        }else{
            System.out.println("This is not leap year");
        }
    }
}
