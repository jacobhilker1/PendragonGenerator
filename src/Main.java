import java.io.PrintWriter;
import java.util.Scanner;
public class Main {
      public static void main(String args[]) {
      Scanner s = new Scanner(System.in);
      Knight k = new Knight();
      System.out.println("Enter your character's name and your character's father's name, seperated by a comma and space like so: 'John, James'.");
      String n = s.nextLine();
      k.setNames(n);      

                     }
}
