import java.util.Hashtable;
import java.util.ArrayList;
public class Character {
  String name, dadsName;
  int age, kidNumber, yearBorn, currentYear, numSibs;
  enum Gender {
    MALE, FEMALE;
  }

  enum Religion { 
    BC, RC, PAGAN;
  }

  public Character() {


  }
  void setNames(String s){
    String[] st = s.split(", ");
    this.name = st[0];
    this.dadsName = st[1];

  } 

}  
