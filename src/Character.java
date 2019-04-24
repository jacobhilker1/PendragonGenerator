import java.util.Hashtable;
import java.util.ArrayList;
public class Character {
  String name, dadsName;
  int age, kidNumber, yearBorn, currentYear, numSibs;
  Hashtable<String, String> culture;
  static class AgeException extends Exception{}
  
  enum Gender {  MALE, FEMALE; }
  enum Religion { BC, RC, PAGAN; }
 
  Gender gender;
  Religion religion;
  
  public Character() {
      culture = new Hashtable<String, String>(1);
      culture.put("Culture","Cymric");
  }
  
  void setNames(String s){
    String[] st = s.split(", ");
    this.name = st[0];
    this.dadsName = st[1];
  } 

  void setGender(int g){ 
      if (g % 2 == 0){
         this.gender = Gender.MALE;
      }
      this.gender = Gender.FEMALE;
  }

  void setAge(int a) throws AgeException {
    if (a < 21) {
     throw new AgeException();
    }
   if (a > 26){
    throw new AgeException();
   } 
    this.age = a;
  } 

  void setYearBorn(int yb){
    this.yearBorn = yb;
  }
}

