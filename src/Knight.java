import java.util.Hashtable;
import java.util.ArrayList;
import java.util.Iterator; 
import java.io.PrintWriter;
public class Knight extends Character {
    //private String name, dadsName;
    //private int age, kidNumber, numSibs yearBorn, currentYear;
    private Hashtable<String, Integer> traits, skills, atts, passions;
    private ArrayList<Character> siblings;
    static class NoGenderException extends Exception{}

    public Knight() {
          super();
          siblings = new ArrayList<Character>();
          traits = new Hashtable<String, Integer>();
          skills = new Hashtable<String, Integer>();
          atts = new Hashtable<String, Integer>();
          passions = new Hashtable<String, Integer>();
          kidNumber = 1;
    }


    
    
    void setGender(String g) throws NoGenderException { 
       if (g.equalsIgnoreCase("male")){
         this.gender = Gender.MALE;
       }
       else if (g.equalsIgnoreCase("female")){
         this.gender = Gender.FEMALE;
  }
  else { 
        throw new NoGenderException();
      }
    }
}
