package MOOC;

import java.util.Scanner;

public class UseContinue2 {
    public static void main (String[] args){
        // create scanner
        Scanner reader = new Scanner(System.in);
        while (true){
            System.out.println("Enter your string : ");
            String string = reader.nextLine();
            if(string == "khadak"){
                continue;
            }else{
                System.out.println("Please Enter khadak");
            }


        }

    }
}
