package MOOC;

import java.util.Scanner;

public class MatchPassword {
    public static void main (String[] args){
        String password ="CaputDraconis";
        Scanner input = new Scanner(System.in);
        System.out.print("Plese Enter your password: ");
        String myPassword = input.nextLine();
        if(myPassword.equals(password)){
            System.out.println("You are welcome");
        }else{
            System.out.println("Off with you");
        }
    }
}
