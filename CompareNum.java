package MOOC;

import java.util.Scanner;

public class CompareNum {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = input.nextInt();
        if(num %3 ==0 && num %5 == 0){
            System.out.println( "FizzBuzz");
        } else if(num %3 == 0){
            System.out.println("Fizz");
        } else if(num %5 == 0){
            System.out.println("Buzz");
        }else {
            System.out.println(num);
        }
    }
}
