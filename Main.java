import java.util.Scanner;
import java.lang.*;
class Main {
  public static void main(String[] args) {
    Scanner kybrd = new Scanner(System.in); 
    System.out.println("Please enter a Username. Username must be 6-15 characters and must start with an Uppercase: ");
    String userName = kybrd.nextLine (); 
         if(userName.length()<6) { 
           System.out.println("ERROR Username must be more than 6 characters!");
         }
         else if(userName.length()>20) {
            System.out.println("ERROR Username must be less than 20 characters!");
         }
         else if(Character.isLowerCase(userName.charAt(0))) {
           System.out.println("ERROR Username must start with uppercase!!");
         }
         else System.out.println("Please enter a Password. Password must be 6-25 characters. There cannot be any spaces or parentheses ( ) }: ");
         String password = kybrd.nextLine (); 
               if(password.length()<8) {
               System.out.println("ERROR Password must be more than 6 characters!");
         }
               else if(password.length()>25) {
                System.out.println("ERROR Password must be less than 20 characters!");
         }
               else if(password.contains(" ")) {
                System.out.println("ERROR Password must not contain spaces!");
         }
               else if(password.contains("(")) {
           System.out.println("ERROR Password must not contain parenthesis");
         }
               else if(password.contains(")")) {
           System.out.println("ERROR Password must not contain parenthesis");
         }
               else System.out.println("You have successfully set a new username and password!");
}
}
