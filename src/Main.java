import java.io.PrintWriter;
import java.util.Scanner;
public class Main {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    Knight k = new Knight();
    System.out.println("Enter your character's name and your character's father's name, seperated by a comma and space like so: 'John, James'.");
    String n = s.nextLine();
    k.setNames(n);      
    System.out.println("Enter your character's gender: ");
    String g = s.nextLine();
    int eNum = 0;
      try {
        k.setGender(g);
      } catch (Knight.NoGenderException e){
        //  s.nextLine();
        System.out.println(g + " is not a valid gender in game terms. Please enter if your character is male or female.");
        g = s.nextLine();
        eNum++;
      } finally {
        if (eNum >= 2){
          k.gender = Character.Gender.MALE; 
          System.out.println("Your character is " + k.gender + "."); 
        }
      }
    
    System.out.println("Enter your character's age: between 21 and 26.");
    int a = s.nextInt();
    int aNum = 0;
    try {
      k.setAge(a);
    } catch (Character.AgeException ae) {
      if (a < 21){
        System.out.println("You're too young!");
        aNum+= 1;
        System.out.println("Enter a number between 21 and 26. This is your characters age.");
        a = s.nextInt();
      } else {
        System.out.println("You're too old!"); 
        System.out.println("Enter a number between 21 and 26. This is your characters age.");
        a = s.nextInt();
        aNum+= 1;
      } 
    } finally {
      if (aNum > 2){
      k.age = 21;
      System.out.println("Your character is " + k.age + ".");
    }
    }
    
    System.out.println("You currently have " + k.points + " points for attributes." + " \n" + "Please enter the number of points you want for your strength attribute.");
    int p = s.nextInt();
    k.setAtt("Strength: ", p); 

  }
}
