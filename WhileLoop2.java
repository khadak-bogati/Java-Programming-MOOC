package MOOC;

import java.util.Scanner;

public class WhileLoop2 {
    public static void main (String[] args){
        // creating scanner
        Scanner reader = new Scanner(System.in);
        // here create while loop that create control
        while (true){
            System.out.println("Exit, press y for exit");
            String input = reader.nextLine();
            if(input.equals("y")){
                break;

            }
            System.out.println("Let's go ahead");

        }
        System.out.println("Sccuess");
    }
}
