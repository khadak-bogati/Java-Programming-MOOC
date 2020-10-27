package MOOC;

import java.util.Scanner;

public class DoubleValue {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your value: ");
        double value = Double.valueOf(input.nextLine());
        System.out.println("THis is your Enter Value: "+value);
    }
}
