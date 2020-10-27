package MOOC;

import java.util.Scanner;

public class Program3 {
    public static void main (String[] args){
        // create scanner
        Scanner reader = new Scanner(System.in);
        //Identyfing the input value declare the value of variable
        int first = 1;
        int second = 2;
        // Assigning the user input to the variable
        first = Integer.valueOf(reader.nextLine());
        second = Integer.valueOf(reader.nextLine());
        //Identifying the operation and declearing a variable of the result
        int result = first * second;

        System.out.println("The product of "+first+" and "+ second+ " is "+result);
    }
}
