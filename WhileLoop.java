package MOOC;

public class WhileLoop {
   public static void main (String[] args){
       int num = 1;
       while (true){
           System.out.println(num);
           if (num>= 5){
               break;
           }
           num+=1;
       }
   }
}
