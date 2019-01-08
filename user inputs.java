
package getuserinput;

import java.util.Scanner;
public class Getuserinput {

    
    public static void main(String[] args) {
           Scanner scan = new Scanner(System.in); 
           System.out.println("Enter a number:");
           int user_input_num =scan.nextInt();
           System.out.print("The user entered number is ");
           System.out.println(user_input_num);
           
           Scanner scan1 = new Scanner(System.in); 
           System.out.println("Enter a number:");
           float user_input_floatnum =scan.nextFloat();
           System.out.print("The user entered float number is ");
           System.out.println(user_input_floatnum);
           
           Scanner scan2 = new Scanner(System.in); 
           System.out.println("Enter a string:");
           String user_input_string =scan.nextLine();
           System.out.print("The user entered string is ");
           System.out.println(user_input_string);
    }
    
}
