package MOOC;

import java.util.Scanner;

public class CarryOn {
    public static void main (String[] args){
        // create scanner
        Scanner reader = new Scanner(System.in);
        // create condition
        while (true){
            System.out.print("Shall we carry On? : ");
            String input = reader.nextLine();
            if(input.equals("no")){
                break;
            }
            System.out.println("Yes we shall carry on");
        }
        System.out.println("Success!");
    }
}
