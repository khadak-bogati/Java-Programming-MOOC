package MOOC;

import java.util.Scanner;

public class PositiveNum2 {
    public static void main(String[] args) {
        // this task is to read input from user
        Scanner reader = new Scanner(System.in);
        //This task is to repeat block until block is exited
        while (true){
            // this task ask the user for an input
            System.out.print("Ener your positive Number: ");
            // this task is to read input from user
            int number = Integer.valueOf(reader.nextLine());
            // This task is to guard and prevent unfit number
            // for the further processing
            if(number < 0){
                System.out.println("Unfit Number: ");
                continue;
            }
            if(number == 0){
                break;
            }
            // this task is print square of number
            System.out.println(number * number);
        }

    }
}
