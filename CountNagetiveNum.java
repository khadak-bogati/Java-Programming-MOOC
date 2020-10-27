package MOOC;

import java.util.Scanner;

public class CountNagetiveNum {
    public static void main (String[] args){
        //this task is to input from user
        Scanner reader = new Scanner(System.in);
        // this task count negative num
        int nagetive = 0;
        int positive = 0;
        int total  = 0;
        int neg_sum = 0;
        int pos_sum = 0;
        int total_sum = 0;
        // this task handle and exit
        while (true){
            // this task is to ask user enter number or exit
            System.out.print("Enter Number (0 for exit): ");
            // this task is to read number from user
            int number = Integer.valueOf(reader.nextLine());
            // this task stop program
            if (number == 0){
                break;
            }
            if(number < 0){
                nagetive = nagetive +1;
                neg_sum = neg_sum+number;
            }
            if(number > 0){
                positive = positive +1;
                pos_sum = pos_sum +number;
            }
        }
        System.out.println("Total nagetive numbers: "+nagetive);
        System.out.println("Total positive numbers: "+positive);
        total = nagetive + positive;
        System.out.println("totoal numbers: "+total);
        System.out.println("Sum of positive numbers: "+pos_sum);
        System.out.println("Sum of negative numbers: "+neg_sum);
        total_sum = (pos_sum + (neg_sum));
        System.out.println("Total of all number Sum: "+total_sum);

    }
}
