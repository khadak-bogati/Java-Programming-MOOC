package MOOC;

import java.util.Scanner;
import java.util.ServiceConfigurationError;

public class GreadeAndPoint {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter your grade: ");
        int grade = input.nextInt();

        if(grade < 0 || grade > 100){
            System.out.println("It is impossible");
        }else if(grade>=0 && grade <=49){
            System.out.println("Grade: Fail");
        }else if (grade > 49 && grade <=59){
            System.out.println("Grade: 1");
        } else if(grade > 59 && grade <=69){
            System.out.println("Grade: 2");
        } else if(grade > 69 && grade <=79){
            System.out.println("Grade: 3");
        }else if (grade > 79 && grade <= 89){
            System.out.println("Grade: 4");
        }else if (grade > 90 && grade < 100) {
            System.out.println("Geade: 5");
        } else if (grade == 100){
            System.out.println("Incredible");
        }
    }
}
